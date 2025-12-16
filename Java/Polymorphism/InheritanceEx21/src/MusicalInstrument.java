class MusicalInstrument 
{
   String instrumentName;
   String material;
   String originCountry;
   String category;
   
   MusicalInstrument()//Default Constructor
   {
	 super();
	 System.out.println(" MusicalInstrument Default Constructor");
	 this.instrumentName =" Generic Instrument";
	 this.material = "Wood / Metal";
	 this.originCountry = "India";
	 this.category = "Musical Instrument";
   }
   
   MusicalInstrument(String instrumentName, String material, String originCountry, String category)//parameterize Constructor
   {
	 super();
	 System.out.println(" MusicalInstrument parameterize Constructor");
	 this.instrumentName = instrumentName;
	 this.material = material;
	 this.originCountry = originCountry;
	 this.category = category;
   }

     public String getInstrumentName() {
	return instrumentName;
}

public void setInstrumentName(String instrumentName) {
	this.instrumentName = instrumentName;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) 
{
	this.material = material;
}

public String getOriginCountry() {
	return originCountry;
}

public void setOriginCountry(String originCountry) {
	this.originCountry = originCountry;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}
   void Display()
   {
	   System.out.println("instrumentName is:"+this.instrumentName);
	   System.out.println("material is:"+this.material);
	   System.out.println("originCountry is:"+this.originCountry);
	   System.out.println("category is:"+this.category);
   }
   void PlaySound()
   {
	   System.out.println("General musical sound");
   }
}//MusicalInstrument class ends here
class StringInstrument extends MusicalInstrument
{
	String  StringinstrumentName;
	int numberOfStrings;
	String playingTechnique;
	String stcategory;
	public StringInstrument() {
		super();
		System.out.println(" StringInstrument Default Constructor");
		 this.StringinstrumentName = "Guitar";
		 this.numberOfStrings = 6;
		 this.playingTechnique = "Plucked";
		 this.stcategory = "String Instrument";
	}
	public StringInstrument(String instrumentName, String material, String originCountry, String category,String  StringinstrumentName,int numberOfStrings,String playingTechnique,String stcategory)//parameterize Constructor
	{
		super(instrumentName, material, originCountry, category);
		 System.out.println(" StringInstrument parameterize Constructor");
		 this.StringinstrumentName = StringinstrumentName;
		 this.numberOfStrings = numberOfStrings;
		 this.playingTechnique = playingTechnique;
		 this.stcategory = stcategory;
	}
	void Display()
	   {
		    super.Display();
		   System.out.println("StringinstrumentName is:"+this.StringinstrumentName);
		   System.out.println("numberOfStrings is:"+this.numberOfStrings);
		   System.out.println("playingTechnique is:"+this.playingTechnique);
		   System.out.println("stcategory is:"+this.stcategory);
	   }
	   void PlaySound()
	   {
		   System.out.println("Sound produced by vibrating strings");
	   }
	
}//StringInstrument class ends here
class WindInstrument extends MusicalInstrument
{
	String WindinstrumentName;
	String Windmaterial;
	boolean airRequired;
	public WindInstrument() 
	{
		super();
		System.out.println(" WindInstrument Default Constructor");
		 this.WindinstrumentName = "Flute";
		 this.Windmaterial = "Bamboo";
		 this.airRequired =true;
	}
	public WindInstrument(String instrumentName, String material, String originCountry, String category,String WindinstrumentName,String Windmaterial,boolean airRequired)
	{
		super(instrumentName, material, originCountry, category);
		 System.out.println(" WindInstrument parameterize Constructor");
		 this.WindinstrumentName = WindinstrumentName;
		 this.Windmaterial = Windmaterial;
		 this.airRequired =airRequired;
	}
	void Display()
	   {
		    super.Display();
		   System.out.println("WindinstrumentName is:"+this.WindinstrumentName);
		   System.out.println("Windmaterial is:"+this.Windmaterial);
		   System.out.println("airRequired is:"+this.airRequired);
	   }
	   void PlaySound()
	   {
		   System.out.println("Sound produced by blowing air");
	   }
}//WindInstrument class ends here
class DemoInheritanceMusicalInstrument
{
	public static void main(String[] args)
	{
		MusicalInstrument m1;
		m1=new MusicalInstrument();
		m1.Display();
		m1.PlaySound();
		
		m1=new StringInstrument();
		m1.Display();
		m1.PlaySound();
		
		m1=new WindInstrument();
		m1.Display();
		m1.PlaySound();
	}
}