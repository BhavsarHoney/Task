package list;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	public static void playerDetails(ArrayList list) {
		System.out.println("Player Details");
		   for (Object p : list) {
			   System.out.println(p);
		   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
         String PlayerName;
         int Age;
         String Country;
         String Skill;
         int p;
         int removed;
         ArrayList list=new ArrayList();
         System.out.println("Enter the player details");
         System.out.println("Enter player name");
         PlayerName=sc.next();
         list.add(PlayerName);
         System.out.println("Enter age");
         Age=sc.nextInt();
         list.add(Age);
         System.out.println("Enter Country");
         Country=sc.next();
         list.add(Country);
         playerDetails(list);
         System.out.println("Enter Skill");
         Skill =sc.next();
         ArrayList<String>s =new ArrayList<>();
         s.add("batsman");
         s.add("bowler");
         s.add("allrounder");
         s.add("wicketkeeper");
         if(!s.contains(Skill.toLowerCase())) {
        	 System.out.println("skill contain only batsman,bowler,allrounder,wicktkeeper");
        	 return;
         }
         System.out.println("Enter the position to add the skill");
          p =sc.nextInt();
         list.set(p, Skill);
         playerDetails(list);
         System.out.println("Enter the position of the detail to be removed");
         removed =sc.nextInt();
         list.remove(removed);
         playerDetails(list);
         
         
         sc.close();    
         
         
         
	}

	

}