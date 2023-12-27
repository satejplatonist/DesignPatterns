package designPatterns;

public class Main 
{
   public static void main(String[] args) 
   {
	   Sports cricket = SportsFactory.SportsInfo("Cricket")  ;
	   System.out.println(cricket.toString());
	   
	   Sports Under_Water_Hockey = SportsFactory.SportsInfo("Under Water Hockey");
	   System.out.println(Under_Water_Hockey.toString());
   }
}


class SportsFactory
{
	public static Sports SportsInfo(String sport)
	{
		if("CRICKET".equalsIgnoreCase(sport))return new Cricket();
		else if("UNDER WATER HOCKEY".equalsIgnoreCase(sport))return new UnderWaterHockey();
		return null;
	}
}

