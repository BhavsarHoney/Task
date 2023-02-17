package list3;

import java.util.ArrayList;
import java.util.Scanner;

public class Comparelist {
   public  static void main(String[]args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<String>season14=new ArrayList<>();
	    ArrayList<String>season15=new ArrayList<>();
	    System.out.println("Enter the top 5 scorers of IPL Season 14");
	    for(int i=0;i<5;i++) {
	    	String name=sc.next();
	    	season14.add(name);
	    }
	    System.out.println("Enter the top 5 scorers of IPL Season 15");
	    for (int i=0;i<5;i++) {
	    	String n=sc.next();
	        season15.add(n);
	    }
	    //<String> c=new ArrayList<>();
	    season14.retainAll(season15);
	    System.out.println("Consistent Scorer:"+season14 );
	    sc.close() ;
   }
}

