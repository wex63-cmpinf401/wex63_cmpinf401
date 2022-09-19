package lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String amount=JOptionPane.showInputDialog("Please enter a disdance or a weight amount.");
        String split[]=amount.split(" ");
        String number =split[0];
        double value=Double.valueOf(number.toString());
        String measurement=split[1];
        Convert(measurement,value,amount);

	}
public static void Convert(String measurement,double value,String amount ) {
		
		if (measurement.equalsIgnoreCase("cm")) {
			String new_measurement="in";
			double new_value=value*0.3937007874;
			System.out.println(amount+" = "+new_value+" "+new_measurement);

			}
		else if(measurement.equalsIgnoreCase("in")) {
			String new_measurement="cm";
			double new_value=value*2.54;
			System.out.println(amount+" = "+new_value+" "+new_measurement);

		    }
		else if(measurement.equalsIgnoreCase("yd")) {
			String new_measurement="m";
			double new_value=value*0.9144;
			System.out.println(amount+" = "+new_value+" "+new_measurement);

		    }		
		else if(measurement.equalsIgnoreCase("m")) {
			String new_measurement="yd";
			double new_value=value*1.0936133 ;
			System.out.println(amount+" = "+new_value+" "+new_measurement);

		    }	
		else if(measurement.equalsIgnoreCase("oz")) {
			String new_measurement="gm";
			double new_value=value*28.3495231 ;
			System.out.println(amount+" = "+new_value+" "+new_measurement);

		    }
		else if(measurement.equalsIgnoreCase("gm")) {
			String new_measurement="oz";
			double new_value=value*0.0352739619 ;
			System.out.println(amount+" = "+new_value+" "+new_measurement);

		    }
		else if(measurement.equalsIgnoreCase("lb")) {
			String new_measurement="kg";
			double new_value=value*0.45359237 ;
			System.out.println(amount+" = "+new_value+" "+new_measurement);
		    }
		else if(measurement.equalsIgnoreCase("kg")) {
			String new_measurement="lb";
			double new_value=value*2.20462262 ;
			System.out.println(amount+" = "+new_value+" "+new_measurement);
		}

}
}
