package designPatterns;

public class ThreadSafeSingleton 
{
   private static ThreadSafeSingleton instance;
   
   private ThreadSafeSingleton() {}
   
   public static ThreadSafeSingleton getInstanceDoubleChechedLocking()
   {
	   if(instance==null)
	   {
		   synchronized(ThreadSafeSingleton.class)
		   {
			   if(instance==null)
			   {
				   instance = new ThreadSafeSingleton();
			   }
		   }
	   }
	   return instance;
   }
}
