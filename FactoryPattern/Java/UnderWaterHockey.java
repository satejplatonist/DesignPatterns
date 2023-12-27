package designPatterns;

public class UnderWaterHockey extends Sports
{

	public UnderWaterHockey() {}
	@Override
	public String getNumberofPlayers() 
	{
		return "3";
	}

	@Override
	public String getOutdoor() 
	{
		return "outdoor";
	}

	@Override
	public String popularity() 
	{
		return "Not Popular";
	}
   
	@Override
	public String toString() 
	{
	    return super.toString();
	}
}
