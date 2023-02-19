import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of players");
    int n=sc.nextInt();
    int capnumber;
    TreeMap<Integer,Player> detais=new TreeMap<>();
    for(int i=0;i<n;i++){
      System.out.println("Enter the details of the player 1");
       capnumber =sc.nextInt();
       String name=sc.next();
       String team=sc.next();
       String Skill=sc.next();
       detais.put(capnumber,new Player(name,team,Skill));
    }
    System.out.println("Player Details");

    
		for(Map.Entry<Integer, Player> entry:detais.entrySet())
		{
			System.out.println(entry.getKey()+"--"+entry.getValue().getName()+"--"+entry.getValue().getTeam()+"--"+entry.getValue().getSkill());
		
		}
 }
}
