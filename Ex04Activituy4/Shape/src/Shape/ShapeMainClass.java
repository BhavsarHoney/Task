package Shape;

import java.util.Scanner;

public class ShapeMainClass {
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println(" 1.Circle");
    	System.out.println("2 .square");
    	System.out.println("Enter the shape");
    	int Shape=sc.nextInt();
    	switch(Shape) {
    	case 1:
    		System.out.println("Enter the radius");
    	    int r=sc.nextInt();
    	    if (r<0) {
    	    	System.out.println("invalid");
    	    }
    	    Circle c=new Circle();
    	     c.calculateAre(r);
    	     break ;
    	case 2 :
    		System.out.println("Enter the side");
    		int s =sc.nextInt();
    		if(s<0) {
    			System.out.println("invalid");
    		}
    		Square S=new Square();
    		S.calculateAre(s);
    		break;
    		default :
    			System.out.println("invalid");
    			

    	}
    	sc.close();
    }

	
  
}
