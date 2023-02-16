package Vehicles;

public class TwoWheeler extends Vehicle {
     private boolean kickStartAvailable ;
     public TwoWheeler(String Make,String VehicleNumber,String FuelType,int FuelCapacity, int Cc,boolean KickStartAvailable){
        super(Make,VehicleNumber,FuelType,FuelCapacity,Cc);
        this.kickStartAvailable=KickStartAvailable;
     }
     public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
     public void displayDetailInfo()
     {
        super.displayBasicInfo();
        System.out.println("--Detailed information--");
        if(this.kickStartAvailable)
            System.out.println("Yes");
        else
            System.out.println("No");
    
     }
   
     
     }