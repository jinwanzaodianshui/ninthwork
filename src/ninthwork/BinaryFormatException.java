package ninthwork;
import java.util.Scanner;
public class BinaryFormatException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		String s = input.next();
		try {
			int i = bin2Dec(s);
			System.out.print(i);
		} catch (NumberFormatException e) {
			System.out.print("Wrong!\n" + e);
			System.exit(1);
		}
	}

	public static int bin2Dec(String hex) throws BinaryFormatException {
		int value = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			if (hexChar == '0' || hexChar == '1') {
				value = value * 2 + binChar2Dec(hexChar);
			} else {
				throw new NumberFormatException("Not a binstring!");
			}
		}
		return value;
	}

	public static int binChar2Dec(char ch) {
		return ch - '0';
	}
	class BinaryFormatException extends NumberFormatException {
		public BinaryFormatException(String s) {
			super(s);
		}
}
