package javaprograms;
import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter... ");
		char alphabet = sc.next().charAt(0);
		if (alphabet == 'a' &&  alphabet == 'e' && alphabet == 'i' && alphabet == 'o' && alphabet == 'u')
		{
			System.out.println("It is a vowel");
		}
		else;
		{
			System.out.println("It is a consonant");
			sc.close();
		}
	}
}
