package problem_solving;

import java.text.DecimalFormat;

public class setPrecisionForDouble {

	public static void main(String[] args) {
		double a = 0.9;
		 
	    // Setting the precision to 20 places
	    System.out.println(
	      String.format("%.20f", a));
	 
	    double b = 1;
	 
	    // Setting the precision to 5 places
	    System.out.println(
	      String.format("%.5f", b));
	    
	    double no=12222.786222;
	    DecimalFormat dec = new DecimalFormat("#0.00");
	    System.out.println(dec.format(no));
	    
	   // Setting the precision to 3 places and convert to decimal at the same time
	    double z = 2222.1111;
	    z = Double.parseDouble(new DecimalFormat("##.###").format(z));
	    z = z + 2;
	    System.out.println(z);

	}

}
