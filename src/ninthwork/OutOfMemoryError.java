package ninthwork;
import java.util.ArrayList;
public class OutOfMemoryError {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list = new ArrayList<Double>();
	    double i = 123456;
	    while(true){
	        i++;
	        try{
	            list.add(i);
			} catch (OutOfMemoryError e) {
				// TODO: handle exception
				System.out.print("Wrong!\n" + e);
				System.exit(1);
			}
		}
	}
}
