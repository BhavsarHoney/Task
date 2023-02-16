package Shape;

public class Circle extends  Shape {

	

	@Override
	void calculateAre(int value) {
		// TODO Auto-generated method stub
		double area= 3.14*value*value;
		System.out.println(" Area of circle is :"+area);
	}
}
