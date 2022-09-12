package lab2;

import javax.swing.JOptionPane;

public class DecomposingMoney {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Please enter a number");
		int number = Integer.parseInt(num);
		int a =number%10;
		int b =number/10%10;
		int c =number/100%10;
		int d =number/1000;
		
		
		
		
		System.out.println(d+" grands");
		System.out.println(c+" Benjamins");
		System.out.println(b+" sawbucks");
		System.out.println(a+" bucks");

	}

}
