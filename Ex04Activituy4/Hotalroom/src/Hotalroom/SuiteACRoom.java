package Hotalroom;

public class SuiteACRoom  extends HotalRoom{
	private  int ratePerSqFeet;

	public SuiteACRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=15;
	}

	public int getRatePerSqFeet() {
		if (hasWifi) {
		return ratePerSqFeet+2;}
		else {
		return ratePerSqFeet;}
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
}