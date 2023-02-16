package Vehicles;

public class Vehicle{
    String make ;
    String vehicalNumber ;
    String fuelType;
    int fuelCapacity;
    int cc ;
    public Vehicle(String Make,String VehicleNumber,String FuelType,int FuelCapacity, int Cc) {
        this.make =Make;
        this.vehicalNumber=VehicleNumber;
        this.fuelType=FuelType;
        this.fuelCapacity=FuelCapacity;
        this.cc=Cc;
    }
    public void setVehicleNumber(String VehicleNumber)
    {
        this.vehicalNumber=VehicleNumber;
    }
    public void setFuelType(String FuelType)
    {
        this.fuelType=FuelType;
    }

    public void setFuelCapacity(int FuelCapacity)
    {
        this.fuelCapacity=FuelCapacity;
    }
    public void setCc(int Cc)
    {
        this.cc=Cc;
    }

    public String getVehicleNumber()
    {
       return vehicalNumber;
    }
    public String getFuelType()
    {
       return fuelType;
    }

    public int getFuelCapacity()
    {
        return fuelCapacity;
    }
    public int getCc()
    {
          return cc;
    }
    void displayMake(){
        System.out .println("Make :" +make);
    }
    void displayBasicInfo(){
        System.out.println("***"+make+"***");
        System.out.println("---Basic Information---");
        System.out.println("VehicalString :" +vehicalNumber);
        System.out.println("Fule type :"+fuelType);
        System.out.println("FuelCapacity :" +fuelCapacity);
        System.out.println("Cc : "+cc);
    }
    void displayDetailInfo(){

    }
}