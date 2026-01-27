package com.ash.demos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagement {

	int  empId;
	String empName;
	double empSal;
	Scanner sc=new Scanner(System.in);
	public void addEmp()
	{
		System.out.println("Enter empId: ");
		empId=sc.nextInt();
		System.out.println("Enter empName: ");
		empName=sc.next();
		System.out.println("Enter empSalary");
		empSal=sc.nextDouble();
		
		try {
			Connection con=DBUtility.getSQLConnection();
			String insertQuery="insert into employee values(?,?,?)";
			PreparedStatement psmt=con.prepareStatement(insertQuery);
			psmt.setInt(1, empId);
			psmt.setString(2, empName);
			psmt.setDouble(3, empSal);
			
			int rows=psmt.executeUpdate();
			if(rows>0)
			
				System.out.println("------Data Inserted Sucessfully-------");
			DBUtility.resourcesRelease(psmt, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void searchEmp()
	{
		System.out.println("Enter empId:");
		empId=sc.nextInt();
		try {
			Connection con=DBUtility.getSQLConnection();
			String searchquery="select *from employee where id=?";
			PreparedStatement psmt=con.prepareStatement(searchquery);
			psmt.setInt(1,empId);
			ResultSet rs=psmt.executeQuery();
			if(rs.next())
			{
				int empId=rs.getInt(1);
				String empName=rs.getString(2);
				double  empSal=rs.getDouble(3);
				
				System.out.println("Employee Found:");
				System.out.println("empId:"+empId);
				System.out.println("empName:"+empName);
				System.out.println("empSal:"+empSal);
			}
			else
			{
				System.out.println("Employee Not Found");
			}
			DBUtility.resourcesRelease(rs,psmt, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateEmp()
	{
		System.out.println("Enter empId to update:");
		empId=sc.nextInt(); 
		try {
			Connection con=DBUtility.getSQLConnection();
			String checkquery="select *from employee where id=?";
			PreparedStatement psmt=con.prepareStatement(checkquery);
			psmt.setInt(1, empId);
			ResultSet rs=psmt.executeQuery();
			if(rs.next())
			{
				System.out.println("Enter empName: ");
				empName=sc.next();
				System.out.println("Enter empSalary");
				empSal=sc.nextDouble();
				
				String updateQuery="update employee set name=?,salary=? where id=?";
				PreparedStatement ps=con.prepareStatement(updateQuery);
				ps.setString(1, empName);
				ps.setDouble(2, empSal);
				ps.setInt(3, empId);
				
				int rows=ps.executeUpdate();
				if(rows>0)
				{
					System.out.println("Employee updated Successfully");
				}
				DBUtility.resourcesRelease(ps, con);
			}
			else
			{
				System.out.println("Employee not found");
			}
			DBUtility.resourcesRelease(rs,psmt,con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteEmp()
	{
		System.out.println("Enter empId to update:");
		empId=sc.nextInt(); 
		try {
			Connection con=DBUtility.getSQLConnection();
			String checkQuery="select *from employee where id=?";
			PreparedStatement psmt=con.prepareStatement(checkQuery);
			psmt.setInt(1, empId);
			ResultSet rs=psmt.executeQuery();
			if(rs.next())
			{
				String deleteQuery="delete from employee where id=?";
				PreparedStatement ps=con.prepareStatement(deleteQuery);
				ps.setInt(1, empId);
				int rows=ps.executeUpdate();
				if(rows>0)
				{
					System.out.println("Employee Deleted Sucessfully");
				}
				DBUtility.resourcesRelease(ps, con);
			}
			else
			{
				System.out.println("Employee Not Found");
			}
			DBUtility.resourcesRelease(psmt, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void displayAll()
	{
		try {
			Connection con = DBUtility.getSQLConnection();
			String query="select * from employee";
			PreparedStatement psmt=con.prepareStatement(query);
			ResultSet rs=psmt.executeQuery();
			
			System.out.println("+----------+----------------------+------------+");
	        System.out.println("| ID       | NAME                 | SALARY     |");
	        System.out.println("+----------+----------------------+------------+");
			while(rs.next())
			{
				empId=rs.getInt(1);
				empName=rs.getString(2);
				empSal=rs.getDouble(3);
				
	            System.out.printf("| %-8d | %-20s | %-10.2f |%n", empId, empName, empSal);

			}
			 System.out.println("+----------+----------------------+------------+");
			DBUtility.resourcesRelease(rs,psmt,con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
