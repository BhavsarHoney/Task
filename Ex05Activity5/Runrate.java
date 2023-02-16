package Exception;

import java.util.Scanner;

public class Runrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
         float Runrate;
         System.out.println("Enter the total runs scored");
             int trunscored=sc.nextInt();
           System.out.println("Enter the total overs faced");
              int toversfaced=sc.nextInt();
              try {
            	  Runrate=trunscored/toversfaced;
            	  System.out.println("Current Run Rate :"+Runrate);
              }
	            catch(Exception e) {
		             System.out.println(e);}
              sc.close();
	}

}
