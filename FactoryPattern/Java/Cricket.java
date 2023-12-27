package designPatterns;

public class Cricket extends Sports
{
    public Cricket() {}
	@Override
	public String getNumberofPlayers() 
	{
	    return "11";
	}

	@Override
	public String getOutdoor() 
	{
		return "Outdoor";
	}

	@Override
	public String popularity() 
	{
		return "popular";
	}

	@Override
	public String toString() 
	{
	    return super.toString();
	}
    
}
