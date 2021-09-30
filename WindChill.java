package javaprograms;
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature (F): ");
		double temperature = sc.nextDouble();
		System.out.println("Enter Wind Speed (m/h): ");
		double windSpeed = sc.nextDouble();
		double windChill = 35.74 + (0.6215 * temperature) + (((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16));
		System.out.println("The WindChill value is :" + windChill);
		sc.close();
	}
}