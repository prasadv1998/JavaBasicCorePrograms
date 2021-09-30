package javaprograms;



public class PowerOfTwo {
	public static void main(String[] args) {
		int n = 21;
		int i = 1;
		while(Math.pow(2, i) <= Math.pow(2,n))
		{
			System.out.println("2^" + i + "=" + Math.pow(2, i));
			i++;
		}
		System.out.print("The 2^21 value:");
		double powerValue = Math.pow(2, n);
		System.out.println(powerValue);
	}
}