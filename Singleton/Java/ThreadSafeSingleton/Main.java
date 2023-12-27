package designPatterns;

public class Main 
{
   public static void main(String[] args) 
   {
	  // all instances (instance1, instance2, instance3) are pointing to 
	  // single object of ThreadSafeSingleton
	  ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
	  ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
	  ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstance();

	  // all instances (instance1, instance2, instance3) are pointing to 
	  // single object of ThreadSafeSingleton with double-checked locking
	  ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstanceDoubleChechedLocking();
	  ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstanceDoubleChechedLocking();
	  ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstanceDoubleChechedLocking();
   }
}


