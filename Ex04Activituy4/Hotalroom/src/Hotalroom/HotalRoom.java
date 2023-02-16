package Hotalroom;

public class HotalRoom {
     String hotelName;
int numberOfSqFeet;
boolean hasTV ;
boolean hasWifi;
public HotalRoom() {
	super();
}
public HotalRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
	super();
	this.hotelName = hotelName;
	this.numberOfSqFeet = numberOfSqFeet;
	this.hasTV = hasTV;
	this.hasWifi = hasWifi;
}
public int calculateTariff( int costperSquerfeet) {
	
	return  numberOfSqFeet*costperSquerfeet;
}
   public  int getRatePerSqFeet() {
	   return 0;
   }
}
