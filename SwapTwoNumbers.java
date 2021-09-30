package javaprograms;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float first = 17, second = 21;
		System.out.println("Before swapping...");
		System.out.println("First number= " + first);
		System.out.println("Second number= " + second);
		first = first - second;
		second = first + second;
		first = second - first;
		System.out.println("After swapping...");
		System.out.println("First number= " + first);
		System.out.println("Second number= " + second);
	}
}
