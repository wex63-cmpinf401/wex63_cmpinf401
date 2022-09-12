package lab2;

import javax.swing.JOptionPane;

public class Pythagorean {

	public static void main(String[] args) {
		String side1 = JOptionPane.showInputDialog("Please enter a side");
		int a = Integer.parseInt(side1);
		String side2 = JOptionPane.showInputDialog("Please enter a side");
		int b = Integer.parseInt(side2);
		double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		c=c*100;
		int r = (int)Math.round(c);
		double d=r/100.0;
		
		
		System.out.println("The hypotenuse is "+ d);
		

	}

}
