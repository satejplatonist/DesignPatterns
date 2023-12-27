package designPatterns;

public class Main 
{
   public static void main(String[] args) 
   {
	  // all instances (instance1, instance2, instance3) are pointing to 
	  // single object of EagerInitializedSingleton
	  EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
	  EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
	  EagerInitializedSingleton instance3 = EagerInitializedSingleton.getInstance();
   }
}
