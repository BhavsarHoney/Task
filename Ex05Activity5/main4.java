package ex4;

import java.util.Scanner;

public class main4 {
  public static void main(String[]args) {
	   Scanner sc=new Scanner(System.in);
	   String team[]= {"chennai cuper kings","sun Risers"," delhi daredevils", "kings xi punjab"
			  , "kolkata knight riders",
			  " mumbai indians",
			  " rajasthan royals",
			   "royal challengers bangalore" };
	   System.out.println("Enter the expected winner team of IPL Season 10");
	   String t1=sc.nextLine();
	    boolean a= false;
	   for(String t:team) {
		   if(t.toLowerCase().equals(t1.toLowerCase())) {
			   a=true; 
			   break;
		   }
	   }
	   try {
		   if(!a)
		   throw new  TeamNameNotFound("Customexception :TeamNameNotFound");
	   }
	   catch(Exception e){
		   System.out.println(e);
		 
	   } 
	   System.out.println("Enter the expected runner Team of IPL Season 1");
	   String t2=sc.nextLine();
	   for(String t:team) {
		   if(t.toLowerCase().equals(t2.toLowerCase())) {
			   a=true; 
			   break;
		   }}
		   try {
			   if(!a)
			   throw new  TeamNameNotFound("Customexception :TeamNameNotFound");
		   }
		   catch(Exception e){
			   System.out.println(e);
		   } 
		   
		   if(a) {
			   System.out.println("Expected IPL Season 10 winner" +t1);
			   System.out.println("Expected IPL Season 10  runner" +t2);
		   }
	   }
	   
  }

