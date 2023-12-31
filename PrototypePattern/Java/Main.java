package designPatterns;

import java.util.List;

public class Main 
{
   public static void main(String[] args) throws CloneNotSupportedException 
   {
	  MonstersBatch m1 = new MonstersBatch();
	  m1.loadData();
	  
	  MonstersBatch m2 = (MonstersBatch)m1.clone();
	  
	  MonstersBatch m3 = (MonstersBatch)m2.clone();
	  
	  List<Monster> m4 = m2.getMonsterBatch();
	  m4.add(new Monster(8,"Monster"+8));
	  
	  List<Monster> m5 = m3.getMonsterBatch();
	  m5.remove(m5.size()-1);
	  
	  System.out.println(m1);
	  System.out.println(m2);
	  System.out.println(m3);
	  System.out.println(m4);
	  System.out.println(m5);
   }
}



