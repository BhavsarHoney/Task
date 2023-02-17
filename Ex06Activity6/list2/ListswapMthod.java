 package list2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ListswapMthod {
	public static void teamsname(ArrayList<String> teams) {
		   for(Object t:teams) {
			   System.out.println(t);
		   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList <String> teams =new ArrayList<String>();
		System.out.println("Enter the team name");
		for(int i=0;i<5;i++) {
			 String name = sc.nextLine();
			 teams.add(name);		 
		}
		//teamsname(teams);
		System.out.println("Enter swap positions");
		int position=sc.nextInt();
		Collections.swap(teams,0,position);
		teamsname(teams);

	}
}

 
    

