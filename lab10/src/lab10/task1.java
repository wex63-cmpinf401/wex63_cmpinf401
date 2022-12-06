package lab10;

public class task1 {


	public static void main(String[] args) {
		System.out.println(sumOfDigits(7));
		System.out.println(sumOfDigits(-123));
		System.out.println(sumOfDigits(666));
		System.out.println(sumOfDigits(100));
		System.out.println(sumOfDigits(0));


	}

	public static int sumOfDigits(int x) {
		if(x<0) {
			x= x*(-1);
		}
		if(x==0)
			return 0;

		return (x%10+sumOfDigits(x/10));

	}


}
