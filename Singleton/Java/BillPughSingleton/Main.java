package designPatterns;

public class Main 
{
   public static void main(String[] args) 
   {
	  // all instances (instance1, instance2, instance3) are pointing to 
	  // single object of BillPughSingleton class using HelperSingletonClass inner - static class
	  BillPughSingleton instance1 = BillPughSingleton.getInstance();
	  BillPughSingleton instance2 = BillPughSingleton.getInstance();
	  BillPughSingleton instance3 = BillPughSingleton.getInstance();

	  // all instances (instance1, instance2, instance3) are pointing to 
	  // single object of BillPughSingleton class using HelperSingletonClass inner - static class (another way)
	  BillPughSingleton1 instance4 = BillPughSingleton1.getInstance();
	  BillPughSingleton1 instance5 = BillPughSingleton1.getInstance();
	  BillPughSingleton1 instance6 = BillPughSingleton1.getInstance();
   }
}


