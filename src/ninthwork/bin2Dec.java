package ninthwork;
import java.util.Scanner;
public class bin2Dec {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Binary number: ");
		String s = input.next();
		try {
	    		Integer.parseInt(s, 2);
		} catch (NumberFormatException e) {
	    	// TODO: handle exception
	    	System.out.println("Wrong! not binary number.");
	    	System.exit(1);
		}
		System.out.println("Decimal number: " + bin2Dec(s));
	}
	public static int bin2Dec(String binaryString) {
		return Integer.parseInt(binaryString, 2);
	}
}
