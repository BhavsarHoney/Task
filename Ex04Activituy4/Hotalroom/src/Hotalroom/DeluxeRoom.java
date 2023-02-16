package Hotalroom;

public class DeluxeRoom extends HotalRoom {
      int ratePerSqFeet;

	public DeluxeRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=10;
	}
	public int  getRatePerSqFeet() {
		if(hasWifi) {
			return ratePerSqFeet+2 ;
		}
		else {
			return ratePerSqFeet;
		}
		
		
	}
	

	  
}
