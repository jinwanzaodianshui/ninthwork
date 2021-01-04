package ninthwork;
import java.util.Scanner;
public class NumberFormatException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex-string: ");
		String s = input.next();
		try {
			int i = hexToDecimal(s);
			System.out.print(i);
		} catch (NumberFormatException e) {
			System.out.print(e);
			System.exit(1);
		}
	}

	public static int hexToDecimal(String hexString) throws NumberFormatException {
		int value = 0;
		hexString = hexString.toUpperCase();
		for (int i = 0; i < hexString.length(); i++) {
			char hexChar = hexString.charAt(i);
			if ((hexChar >= 'A' && hexChar <= 'F') || (hexChar >= '0' && hexChar <= '9')) {
				value = value * 16 + hexCharToDecimal(hexChar);
			} else {
				throw new NumberFormatException("Wrong! Not a hexstring.");
			}
		}
		return value;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}
