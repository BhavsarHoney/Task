package Vehicles;

import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("1.FourWheele");
      System.out.println("2.Two Wheeler");
      System.out.println("Enter Vehical Type : ");
      int choise=sc.nextInt();
      System.out.println("Vehical Make : ");
      String make=sc.next();
      System.out.println("Vehicle Number:");
      String vehicalNumber=sc.next();
      System.out.println("Fule type :");
      System.out.println("1.Petrol");
      System.out.println("2.Diesel");
      String fuleType=sc.next();
      System.out.println("Fuel Capacity:");
      int fuelCapacity=sc.nextInt();
      System.out.println("Engine CC:");
      int Cc=sc.nextInt();
     // System.out.println("");
      switch (choise) {
        case 1: //fourweel
        System.out.println("Audio System:");
                String audiosystem =sc.next();
                System.out.println("Number of Doors:");
                int numberfodoors =sc.nextInt();
                FourWheeler fourWheel=new FourWheeler(make,vehicalNumber,fuleType ,fuelCapacity, Cc,audiosystem ,numberfodoors);
                fourWheel.displayDetailInfo();
                break;
         case 2://two wheele
             System.out.println("Kick Start Available (Y/N)");
              String kickStartAvailable= sc.next();
              TwoWheeler twoWheeler;
             if (kickStartAvailable.toLowerCase().equals("y"))
                    twoWheeler = new TwoWheeler(make,vehicalNumber, kickStartAvailable, fuelCapacity, Cc, true);
                else
                    twoWheeler = new TwoWheeler(make,vehicalNumber , fuleType, fuelCapacity, Cc,false);
            // TwoWheeler twoWheeler= new TwoWheeler(make,vehicleNumber, fuelType,fuelCapacity, Cc,true);

             twoWheeler.displayBasicInfo();
             twoWheeler.displayDetailInfo();
             break;
      
        default:
            System.out.println("Invalid");
            break;
      }

 
   sc.close();

    }

 
    
}
