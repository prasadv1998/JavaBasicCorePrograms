package javaprograms;
import java.util.Scanner;
public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend value");
		int dividend = sc.nextInt();
		System.out.println("Enter divisor value");
		int divisor = sc.nextInt();
	    double quotient = (double)dividend / divisor;
	    int remainder =  dividend % divisor;
	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	    sc.close();
	  }
}	