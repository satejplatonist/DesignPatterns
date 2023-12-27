package designPatterns;

public class Main 
{
   public static void main(String[] args) 
   {
	  // all instances (instance1, instance2, instance3) are pointing to 
	  // single object of EagerInitializedSingleton
	  StaticBlockInstance instance1 = StaticBlockInstance.getInstance();
	  StaticBlockInstance instance2 = StaticBlockInstance.getInstance();
	  StaticBlockInstance instance3 = StaticBlockInstance.getInstance();
   }
}


