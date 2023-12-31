package designPatterns;

public class Main 
{
   public static void main(String[] args) 
   {
	  Mobile mobile1 = new Mobile.BuilderClass(34, 4).build();
	  
	  Mobile mobile2 = new Mobile.BuilderClass(56, 8).setHighQualityCamera(true).build();
	  
	  Mobile mobile3 = new Mobile.BuilderClass(256,16).setHighQualityCamera(true).setWirelessSupport(true).build();
	  
	  System.out.println(mobile1.toString());
	  System.out.println(mobile2.toString());
	  System.out.println(mobile3.toString());
   }
}



