package Vehicles;

public class FourWheeler extends Vehicle{
    private String  audioSystem;
  private int numberOfDoors ;
  public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberfodoors){
          super(make, vehicleNumber, fuelType, fuelCapacity, cc);
 
     this.audioSystem=audioSystem;
     this.numberOfDoors=numberfodoors; 
  }
  public void SetAudioSystem(String AudioSystem){
     this.audioSystem=AudioSystem;
  }
  public String getAudioSystem(){
     return audioSystem;
  }
  public void SetNumberOfDoors(int NumberOfDoors){
     this.numberOfDoors=NumberOfDoors;
  }
  public int getNumberOfDoors(){
     return numberOfDoors;
  }
  @Override
  void displayDetailInfo() {
      // TODO Auto-generated method stub
         
      super.displayBasicInfo();
      System.out.println("---Detail Information---");
      System.out.println("AudioSystem :" +audioSystem);
      System.out.println("Number of Doors : " +numberOfDoors);
  }
 
     
 }
 