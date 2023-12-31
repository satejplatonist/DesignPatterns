package designPatterns;
import java.util.List;
import java.util.ArrayList;

public class MonstersBatch 
{
   private List<Monster> monsterBatch;
   
   public MonstersBatch() {monsterBatch = new ArrayList<Monster>();}
   
   public MonstersBatch(List<Monster> monsterList) {monsterBatch=monsterList;}
   
   public void loadData()
   {
	  for(int i=0;i<=7;i++)
	  {
		  monsterBatch.add(new Monster(i,"Monster" + i));
	  }
   }

   public List<Monster> getMonsterBatch() 
   {
	return monsterBatch;
   }
   
   public Object clone()throws CloneNotSupportedException
   {
	   List<Monster> tempMonterBatch = new ArrayList<Monster>();
	   for(Monster m : this.getMonsterBatch())
	   {
		   tempMonterBatch.add(m);
	   }
	   return new MonstersBatch(tempMonterBatch);
   }
}
