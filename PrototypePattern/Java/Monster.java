package designPatterns;

public class Monster 
{
   private int id;
   private String monsterIdentification;
   private static final int life = 60;
   private static final int hitPoint = 5;
   
   public Monster() {}
   
   public Monster(int id,String mi) {this.id=id; monsterIdentification=mi;}
   
   public int getId() 
   {
	return id;
   }
   public static int getLife() 
   {
	return life;
   }
   public static int getHitpoint() 
   {
	return hitPoint;
   }

   @Override
   public String toString() 
   {
	return "Monster [id=" + id + ", monsterIdentification=" + monsterIdentification + "]";
   }
      
}
