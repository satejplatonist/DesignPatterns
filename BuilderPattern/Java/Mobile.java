package designPatterns;

public class Mobile 
{
   // necessary fields
   private int memory;
   private int ram;
   
   //optional fields
   private boolean wirelessSupport;
   private boolean highQualityCamera;
   
   public int getMemory() 
   {
		return memory;
   }
   
   public int getRam() 
   {
		return ram;
   }
   
   public boolean isWirelessSupport() 
   {
		return wirelessSupport;
   }
   
   public boolean isHighQualityCamera() 
   {
		return highQualityCamera;
   }

   public Mobile(int memory, int ram, boolean wirelessSupport, boolean highQualityCamera) 
   {
		this.memory = memory;
		this.ram = ram;
		this.wirelessSupport = wirelessSupport;
		this.highQualityCamera = highQualityCamera;
   }
   
   public Mobile(BuilderClass build) 
   {
		this.memory = build.memory;
		this.ram = build.ram;
		this.wirelessSupport = build.wirelessSupport;
		this.highQualityCamera = build.highQualityCamera;
   }
   
   
   
   @Override
   public String toString() 
   {
	return "Mobile [memory=" + memory + ", ram=" + ram + ", wirelessSupport=" + wirelessSupport + ", highQualityCamera="
			+ highQualityCamera + "]";
   }



public static class BuilderClass
   {
	// necessary fields
	   private int memory;
	   private int ram;
	   
	   //optional fields
	   private boolean wirelessSupport;
	   private boolean highQualityCamera;
	   
	   public BuilderClass(int memory, int ram)
	   {
			this.memory = memory;
			this.ram = ram;
	   }
	   
	   public BuilderClass setWirelessSupport(boolean wirelessSupport)
	   {
		   this.wirelessSupport=wirelessSupport;
		   return this;
	   }
	   
	   public BuilderClass setHighQualityCamera(boolean highQualityCamera)
	   {
		   this.highQualityCamera=highQualityCamera;
		   return this;
	   }
	   
	   public Mobile build()
	   {
		   return new Mobile(this);
	   }
   }
   
}
