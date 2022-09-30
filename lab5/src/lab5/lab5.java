package lab5;
import java.util.Random;
import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2=  new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the times to roll the dice");
		int times = sc.nextInt();
		RollDice(times,r1,r2);

		while(true) {
			//Scanner s = new Scanner(System.in);
			System.out.println("enter 1 to continue, enter 2 to exit");
			int response = sc.nextInt();
			if (response == 1) {
				Random r001 = new Random();
				Random r002=  new Random();
				System.out.println("Enter the times to roll the dice");
				int newtimes = sc.nextInt();
				RollDice(newtimes,r001,r002);

			}else {
				System.out.println("stop");
				break;
			}
		}
		}


		public static void RollDice(int times, Random value1, Random value2) {

			int[] c =new int[13];
			for(int i=1;i<=times;i++) {
				int v1 = value1.nextInt(6)+1;
				int v2 = value2.nextInt(6)+1;
				int value = v1+v2;

				//double fraction1=(double)(Math.round(count/times)/100.0);
				c[value]++;

			}
			for(int i=2;i<=12;i++) {
				System.out.println("For the value of "+i+" ,the count is "+c[i] + " and the fraction is "+(double)c[i]/times);

			}






	

	}

}
