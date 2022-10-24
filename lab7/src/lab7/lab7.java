package lab7;

import java.util.Random;
import java.util.Scanner;

public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items will be entered?");
		int number = sc.nextInt();
		double[] arr=new double[number];
		Random r= new Random();
		for(int i=0;i<number;i++) {
			arr[i]= r.nextDouble(1000);		
		}


		//double d1=r.nextDouble(100);
		//System.out.println(d1);
		/*for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------");
		*/

		System.out.println("The max value is "+max(arr));
		System.out.println("The min value is "+min(arr));
		System.out.println("The sum value is "+sum(arr));
		System.out.println("The average value is "+ave(arr));



	}

	public static double max(double [] data) {
		double temp=data[0];
		for(int i=0;i<data.length;i++) {
			if (data[i]>temp) {
				temp=data[i];
			}
		}

		return temp;

	}

	public static double min(double [] data) {
		double temp=data[0];
		for(int i=0;i<data.length;i++) {
			if (data[i]<temp) {
				temp=data[i];
			}
		}

		return temp;

	}
	public static double sum(double [] data) {
		double sum=0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		return sum;
	}

	public static double ave(double [] data) {
		double s=sum(data);
		return s/data.length;

	}

}
