// The above one can also be done the following way
// create another file for public class bellow

package designPatterns;

public class BillPughSingleton1 
{
	private static BillPughSingleton1 instance;
	
    private BillPughSingleton1() {}
    
    private static class HelperSingletonClass
    {
    	static BillPughSingleton1 getInstance()
    	{
    		if(instance==null)
    		{
    			instance = new BillPughSingleton1();
    		}
    		return instance;
    	}
    	
    }
    
    public static BillPughSingleton1 getInstance()
    {
    	return HelperSingletonClass.getInstance();
    }
}
