class Artist 
{
       int artistId;
       String name;
       int experienceYears;
       String artField;
       
     Artist() 
   	{
   		super();
   		System.out.println("  Artist Default Constructor");
   		this.artistId = 101;
   		this.name = "Sanika";
   		this.experienceYears = 10;
   		this.artField = "Performing / Visual";
   	}
	Artist(int artistId, String name, int experienceYears, String artField) 
	{
		super();
		System.out.println("  Artist parameterize Constructor");
		this.artistId = artistId;
		this.name = name;
		this.experienceYears = experienceYears;
		this.artField = artField;
	}
	
    public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	public String getArtField() {
		return artField;
	}
	public void setArtField(String artField) {
		this.artField = artField;
	}
	void performArt()
    {
    	System.out.println("Artist is performing creative art");
    }
    void Display()
    {
    	System.out.println("artistId is:"+this.artistId);
    	System.out.println("name is:"+this.name);
    	System.out.println("experienceYears is:"+this.experienceYears);
    	System.out.println("artField is:"+this.artField);
    }
}//Artist class ends here
class Painter extends Artist
{
	String paintingStyle;
	String canvasType;
	int numberOfPaintings;
	public Painter() {
		super();
		System.out.println("  Painter Default Constructor");
		this.paintingStyle = "Oil Painting";
		this.canvasType = "Cotton Canvas";
		this.numberOfPaintings = 50;
	}
	public Painter(int artistId, String name, int experienceYears, String artField,String paintingStyle,String canvasType,int numberOfPaintings)
	{
		super(artistId, name, experienceYears, artField);
		System.out.println("  Painter parameterize Constructor");
		this.paintingStyle = paintingStyle;
		this.canvasType = canvasType;
		this.numberOfPaintings = numberOfPaintings;
	}
	void performArt()
    {
    	System.out.println("Painter is creating paintings using oil colors on canvas.");
    }
    void Display()
    {
    	super.Display();
    	System.out.println("paintingStyle is:"+this.paintingStyle);
    	System.out.println("canvasType is:"+this.canvasType);
    	System.out.println("numberOfPaintings is:"+this.numberOfPaintings);
    }
	
}//Painter class ends here
class Actor extends Artist
{
	String actingType;
	String famousRole;
	int numberOfMovies;
	public Actor() {
		super();
		System.out.println(" Actor Default Constructor");
		this.actingType = "Theatre / Film";
		this.famousRole = "Lead Actor";
		this.numberOfMovies = 15;
	}
	public Actor(int artistId, String name, int experienceYears, String artField,String actingType,String famousRole,int numberOfMovies) 
	{
		super(artistId, name, experienceYears, artField);
		System.out.println("  Actor parameterize Constructor");
		this.actingType = actingType;
		this.famousRole = famousRole;
		this.numberOfMovies = numberOfMovies;
	}
	void performArt()
    {
    	System.out.println("Actor is performing a role in a movie or theatre.");
    }
    void Display()
    {
    	super.Display();
    	System.out.println("actingType is:"+this.actingType);
    	System.out.println("canvasType is:"+this.famousRole);
    	System.out.println("numberOfPaintings is:"+this.numberOfMovies);
    }
	
}//Actor class ends here
class DemoInheritanceArtist
{
	public static void main(String[] args)
	{
		System.out.println("......Artist.....\n");
		Artist a;
		a=new Artist();
		a.performArt();
		a.Display();
		
		System.out.println("......Painter.....\n");
		a=new Painter();
		a.performArt();
		a.Display();
		
		System.out.println("......Actor.....\n");
		a=new Actor();
		a.performArt();
		a.Display();
	}
}
