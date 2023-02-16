package Hotalroom;

import java.util.Scanner;

public class HotalMain {
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Hotel Tariff Calculator");
    	System.out.println("1. Deluxe Room");
    	System.out.println("2. Deluxe AC Room");
    	System.out.println("3. Suite AC Room");
    	System.out.println("Select Room Type:");
    	int ch=sc.nextInt();
    	System.out.println("Hotel Name:");
        String hotelName = sc.next();
        System.out.println("Room Square Feet Area:");
          int numberOfSqFeet=sc.nextInt();
        System.out.println("Room has TV (yes/no):");
        boolean  hasTV= sc.next().toLowerCase().equals("yes") ? true : false;
        System.out.println("Room has Wifi (yes/no:)");
        boolean hasWifi =sc.next().toLowerCase().equals("yes") ? true : false;
        int t=0;
         System.out.println("Room Tariff per day is");		
        switch(ch) {
        case 1:
        	DeluxeRoom de=new DeluxeRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
        	//System.out.println("Room Tariff per day is");
        	t= de.calculateTariff(de.getRatePerSqFeet());
            break;
        case 2:
        	DeluxeACRoom d=new DeluxeACRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
        	t=d.calculateTariff(d.getRatePerSqFeet());
        	break;
        case 3:
        	SuiteACRoom s=new SuiteACRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
        	t=s.calculateTariff(s.getRatePerSqFeet());
        	break;
        	
        default:
        	System.out.println("invalid");
        }
        	System.out.println(t);
        
        sc.close();	
        	
        	
        }
        
        
        
    	
    
    }

