package designPatterns;

public class BillPughSingleton 
{
    private BillPughSingleton() {}
    
    private static class HelperSingletonClass
    {
    	private static final BillPughSingleton instance = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance()
    {
    	return HelperSingletonClass.instance;
    }
}

