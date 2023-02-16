package EX3;
import java.util.Scanner;
public class Exception3  {
   public static void main(String[] arge) {
	   Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the player name");
	    String name=sc.next();
	    System.out.println("Enter the player age");
	    int age=sc.nextInt();
	    try {
	    if(age<19) {
	    	throw  new InvalidAgeRange("CustomException: InvalidAgeRangeException");
	    	
	    }
	    else {
  		  System.out.println("Player name :"+name);
  		     System.out.println("Player age "+age);
  	}} 
	    catch(InvalidAgeRange e ) {
	    	System.out.println(e);
	    }  
	     //System.out.println("Player name :"+name);
	     //System.out.println("Player age "+age);
	     sc.close();
   }
}
