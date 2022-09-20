package lab4;
import javax.swing.JOptionPane;

public class lab4 {

	public static void main(String[] args) {
		int x = 0;
		do {
			String input1 = JOptionPane.showInputDialog("Please enter an integer which is greater than 0");
			x= Integer.valueOf(input1).intValue();
		}
		while(x<=0);

		int b =0;
		do {
			String input2 = JOptionPane.showInputDialog("Please enter an integer which is greater than 1");
			b= Integer.valueOf(input2).intValue();

		}
		while(b<=1);
		int m = x;
		int n = b;


		int i=0; 
		for(;m >=n;i++){
			m = m/n;

		}
		JOptionPane.showMessageDialog(null, "The answer is: "+i);




	}

}

