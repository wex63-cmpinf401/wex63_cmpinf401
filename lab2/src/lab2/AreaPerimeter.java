package lab2;

import javax.swing.JOptionPane;

public class AreaPerimeter {

	public static void main(String[] args) {
		
		String radius = JOptionPane.showInputDialog("Please enter the radius");
		double r = Integer.parseInt(radius);
		double PI = Math.PI;
		double perimeter = 2*PI*r;
		double area = PI*r*r;
		perimeter=perimeter*100;
		area=area*100;
		int p = (int)Math.round(perimeter);
		int a = (int)Math.round(area);
		double perimeter1= p/100.0;
		double area1=a/100.0;
		
		
		
		
		System.out.println("The circle with radius "+r+" has an area of "+area1+" and a perimeter of "+perimeter1);

	}

}
