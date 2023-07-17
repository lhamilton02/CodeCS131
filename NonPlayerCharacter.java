import java.util.Random;


public class NonPlayerCharacter extends GameCharacter {

	//instance variables
	private boolean active;
	private String IntelligenceType;
	
	public NonPlayerCharacter()
	{
		super();
		this.active=false;
		this.IntelligenceType= "AVERAGE";
		
	}//end empty-argument constructor
	
	public NonPlayerCharacter(String uniqueID, String Personality, boolean active, String Intelligence)
	{
		super(uniqueID, Personality);
		setActive(active);
		setIntelligenceType(IntelligenceType);
		
	}//end preferred argument
	
	
	
	public boolean isActive()
	{
		return active;
	}
	public void setActive(boolean active)
	{
		this.active = active;
	}
	
	public String getIntelligenceType() 
	{
		return IntelligenceType;
	}
	public void setIntelligenceType(String intelligenceType)
	{
		this.IntelligenceType = intelligenceType;
	}
	
	@Override
    public String reportStructure() {
        StringBuilder sb = new StringBuilder(super.reportStructure());
        sb.append("==================================\n");
        sb.append("	Active: ").append(isActive()).append("\n");
        sb.append("	Intelligence: ").append(getIntelligenceType()).append("\n");
        sb.append("==================================\n");
        return sb.toString();
    }//end reportStructure method override
	
	public String introduce() 
	{
        return "Hello, my name is " + getUniqueID();
    }//end introduce method
	
	 public String exclaim() 
	 {
	        String[] exclaimOptions = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
	        Random r = new Random();
	        return exclaimOptions[r.nextInt(exclaimOptions.length)];
	 }//end exclaim method
	
	
	
}//end class
