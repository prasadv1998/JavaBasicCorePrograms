package javaprograms;
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A value:");
		int a = sc.nextInt();
		System.out.println("B value:");
		int b = sc.nextInt();
		System.out.println("C value:");
		int c = sc.nextInt();
		double delta = (b * b) - (4 * a * c);
		double rootOneOfX = (double)(-b + Math.sqrt(delta))/(2*a);
		System.out.println("The root x equation: " + rootOneOfX );
		double rootTwoOfY = (double)(-b - Math.sqrt(delta))/(2*a);
		System.out.println("The root y equation: " + rootTwoOfY );
		sc.close();
	}
}
