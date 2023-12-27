package designPatterns;

public abstract class Sports 
{ 
    public abstract String getNumberofPlayers();
    public abstract String getOutdoor();
    public abstract String popularity();
	@Override
	public String toString() 
	{
		return "Sports [getNumberofPlayers()=" + getNumberofPlayers() + ", getOutdoor()=" + getOutdoor()
				+ ", popularity()=" + popularity() + "]";
	}
        
}
