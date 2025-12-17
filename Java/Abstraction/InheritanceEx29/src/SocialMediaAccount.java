abstract class SocialMediaAccount {
      String userName;
      String userEmail;
      boolean isPublic;
      boolean isVerified;
      String countryOrigin;
      int numberOfPosts;
      int totalLikes;
      int totalComments;
      String createdAt;
      int numberOfImpressions;
      
      SocialMediaAccount()//Default Constructor
  	{
  		super();
  		System.out.println("\nSocialMediaAccount Default Constructor");
  		this.userName = "xyz";
  		this.userEmail = "xyz@gmail.com";
  		this.isPublic = true;
  		this.isVerified = false;
  		this.countryOrigin = "India";
  		this.numberOfPosts = 120;
  		this.totalLikes = 25000;
  		this.totalComments = 4200;
  		this.createdAt = "10-01-2022";
  		this.numberOfImpressions = 5000;
  	}
	SocialMediaAccount(String userName, String userEmail, boolean isPublic, boolean isVerified,
			String countryOrigin, int numberOfPosts, int totalLikes, int totalComments, String createdAt,
			int numberOfImpressions)//parameterize Constructor
	{
		super();
		System.out.println("\nSocialMediaAccount parameterize Constructor");
		this.userName = userName;
		this.userEmail = userEmail;
		this.isPublic = isPublic;
		this.isVerified = isVerified;
		this.countryOrigin = countryOrigin;
		this.numberOfPosts = numberOfPosts;
		this.totalLikes = totalLikes;
		this.totalComments = totalComments;
		this.createdAt = createdAt;
		this.numberOfImpressions = numberOfImpressions;
	}
	
	String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	String getUserEmail() {
		return userEmail;
	}
	void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	boolean isPublic() {
		return isPublic;
	}
	void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	boolean isVerified() {
		return isVerified;
	}
	void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	String getCountryOrigin() {
		return countryOrigin;
	}
	void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	int getNumberOfPosts() {
		return numberOfPosts;
	}
	void setNumberOfPosts(int numberOfPosts) {
		this.numberOfPosts = numberOfPosts;
	}
	int getTotalLikes() {
		return totalLikes;
	}
	void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
	}
	int getTotalComments() {
		return totalComments;
	}
	void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}
	String getCreatedAt() {
		return createdAt;
	}
	void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	int getNumberOfImpressions() {
		return numberOfImpressions;
	}
	void setNumberOfImpressions(int numberOfImpressions) {
		this.numberOfImpressions = numberOfImpressions;
	}
    public String toString()
	{
    	return "userName is:"+this.userName+
    	"userEmail is:"+this.userEmail+
    	"isPublic is:"+this.isPublic+
    	"isVerified is:"+this.isVerified+
    	"countryOrigin is:"+this.countryOrigin+
    	"numberOfPosts is:"+this.numberOfPosts+
    	"totalLikes is:"+this.totalLikes+
    	"totalComments is:"+this.totalComments+
    	"createdAt is:"+this.createdAt+
    	"numberOfImpressions is:"+this.numberOfImpressions;
    }
	abstract String getAccountType();
	

}//SocialMediaAccount class ends here
class InstagramAccount extends SocialMediaAccount
{
	int numberOfFollowers;
	int numberOfFollowing;
	int numberOfHighlights;
	int numberOfPostsArchived;
	int numberOfStoriesArchived;
	int numberOfAudiosSaved;
	InstagramAccount() //Default Constructor
	{
		super();
		System.out.println("\nInstagramAccount Default Constructor");
		this.numberOfFollowers = 15000;
		this.numberOfFollowing = 500;
		this.numberOfHighlights = 18;
		this.numberOfPostsArchived = 30;
		this.numberOfStoriesArchived = 75;
		this.numberOfAudiosSaved = 40;
	}
	InstagramAccount(String userName, String userEmail, boolean isPublic, boolean isVerified,
			String countryOrigin, int numberOfPosts, int totalLikes, int totalComments, String createdAt,
			int numberOfImpressions,int numberOfFollowers,int numberOfFollowing,int numberOfHighlights,int numberOfPostsArchived,int numberOfStoriesArchived,int numberOfAudiosSaved)//parameterize Constructor 
	{
		super(userName, userEmail, isPublic, isVerified, countryOrigin, numberOfPosts, totalLikes, totalComments, createdAt,
				numberOfImpressions);
		System.out.println("\nInstagramAccount parameterize Constructor");
		this.numberOfFollowers = numberOfFollowers;
		this.numberOfFollowing = numberOfFollowing;
		this.numberOfHighlights = numberOfHighlights;
		this.numberOfPostsArchived = numberOfPostsArchived;
		this.numberOfStoriesArchived = numberOfStoriesArchived;
		this.numberOfAudiosSaved = numberOfAudiosSaved;
	}
    public String toString()
    {
		super.toString();
    	return "numberOfFollowers is:"+this.numberOfFollowers+
    	"numberOfFollowing is:"+this.numberOfFollowing+
    	"numberOfHighlights is:"+this.numberOfHighlights+
    	"numberOfPostsArchived is:"+this.numberOfPostsArchived+
    	"numberOfStoriesArchived is:"+this.numberOfStoriesArchived+
    	"numberOfAudiosSaved is:"+this.numberOfAudiosSaved;

    }
	String getAccountType()
	{
	    return "Instagram Account";
	}

}//InstagramAccount class ends here
class LinkedInAccount extends SocialMediaAccount
{
	int numberOfConnections;
	int numberOfProfileViews;
	int numberOfJobsApplied;
	LinkedInAccount() {
		super();
		System.out.println("\nLinkedInAccount Default Constructor");
		this.numberOfConnections = 950;
		this.numberOfProfileViews = 1200;
		this.numberOfJobsApplied = 35;
	}
	LinkedInAccount(String userName, String userEmail, boolean isPublic, boolean isVerified,
			String countryOrigin, int numberOfPosts, int totalLikes, int totalComments, String createdAt,
			int numberOfImpressions,int numberOfConnections,int numberOfProfileViews,int numberOfJobsApplied) //parameterize Constructor
	{
		super(userName, userEmail, isPublic, isVerified, countryOrigin, numberOfPosts, totalLikes, totalComments, createdAt,
				numberOfImpressions);
		System.out.println("\nLinkedInAccount parameterize Constructor");
		this.numberOfConnections = numberOfConnections;
		this.numberOfProfileViews = numberOfProfileViews;
		this.numberOfJobsApplied = numberOfJobsApplied;
	}
    public String toString()
    {
		super.toString();
    	return "numberOfConnections is:"+this.numberOfConnections+
    	"numberOfProfileViews is:"+this.numberOfProfileViews+
    	"numberOfJobsApplied is:"+this.numberOfJobsApplied;
    }
	String getAccountType()
	{
	    return "LinkedIn Account";
	}

}//LinkedInAccount class ends here
class YouTubeAccount extends SocialMediaAccount
{
	int numberOfSubscribers;
	double watchTimeHours;
	boolean isMonetized;
	double estimatedRevenue;
	YouTubeAccount()// Default Constructor
	{
		super();
		System.out.println("\nYouTubeAccount Default Constructor");
		this.numberOfSubscribers = 80000;
		this.watchTimeHours = 4200.5;
		this.isMonetized = true;
		this.estimatedRevenue = 150000.75;
	}
	YouTubeAccount(String userName, String userEmail, boolean isPublic, boolean isVerified, String countryOrigin,
			int numberOfPosts, int totalLikes, int totalComments, String createdAt, int numberOfImpressions,int numberOfSubscribers,double watchTimeHours,boolean isMonetized,double estimatedRevenue)//parameterize Constructor
	{
		super(userName, userEmail, isPublic, isVerified, countryOrigin, numberOfPosts, totalLikes, totalComments, createdAt,
				numberOfImpressions);
		System.out.println("\nYouTubeAccount parameterize Constructor");
		this.numberOfSubscribers = numberOfSubscribers;
		this.watchTimeHours = watchTimeHours;
		this.isMonetized = isMonetized;
		this.estimatedRevenue = estimatedRevenue;
	}
    public String toString()
    {
		super.toString();
    	return "numberOfSubscribers is:"+this.numberOfSubscribers+
    	"watchTimeHours is:"+this.watchTimeHours+
         "isMonetized is:"+this.isMonetized+
    	"estimatedRevenue is:"+this.estimatedRevenue;
    }
	String getAccountType()
	{
	    return "YouTube Account";
	}

}//YouTubeAccount class ends here
class DemoInheritanceSocialMediaAccount
{
	public static void main(String[] args)
	{
		System.out.println("\n.....Social Media Account........");
		SocialMediaAccount s1 ;
		
		
		System.out.println("\n.....Instagram Account........");
		s1= new InstagramAccount();
		System.out.println(s1.getAccountType());
		System.out.println(s1.toString());
		
		System.out.println("\n.....LinkedIn Account........");
		s1= new LinkedInAccount();
		System.out.println(s1.getAccountType());
		System.out.println(s1.toString());
		

	}
}//DemoInheritanceSocialMediaAccount class ends here

