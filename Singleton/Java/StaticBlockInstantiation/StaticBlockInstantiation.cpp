package designPatterns;
import java.lang.Exception;

public class StaticBlockInstance 
{
   private static StaticBlockInstance instance;
   
   private StaticBlockInstance() {}
   
   static
   {
	   try
	   {
		   instance = new StaticBlockInstance();
	   }
	   catch(Exception e)
	   {
		  throw new RuntimeException("Exception occured in creating static Block Instance");  
	   } 
   }
   
   public static StaticBlockInstance getInstance()
   {
	   return instance;
   }
}
