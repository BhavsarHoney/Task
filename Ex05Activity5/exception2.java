package Exception2;

import java.util.Scanner;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of overs ");
         int n=sc.nextInt();
         int run[] =new int[n];
         System.out.println("Enter the number of runs for each over");
         for(int i=0;i<n;i++) {
        	 run[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++) {
        	 System.out.println( run[i]);
         }
         System.out.println("Enter the over number");
         int a=sc.nextInt();
         try {
        
       System.out.println("Runs scored in this over :" +run[a-1]);
   
         }
         catch(Exception e){
        	 System.out.println(e);
         }
	   
   sc.close();
	}

}
