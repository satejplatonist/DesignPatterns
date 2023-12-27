package designPatterns;

public class Main 
{
   public static void main(String[] args) 
   {
	  // all instances (instance1, instance2, instance3) are pointing to 
	  // single object of EagerInitializedSingleton
	  LazyInitializedSingleton  instance1 = LazyInitializedSingleton.getInstance();
	  LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
	  LazyInitializedSingleton instance3 = LazyInitializedSingleton.getInstance();
   }
}


