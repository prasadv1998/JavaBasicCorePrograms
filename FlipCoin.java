package javaprograms;

public class FlipCoin {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 1;
		int counter = 1;
		int numberOfFlips = 21;
		while (counter != numberOfFlips)
		{
			counter++;
			if(Math.random() <0.5 )
			{
				tails++;
			}
			else
			{
				heads++;
			}
		}
		double headsPercentage = (double) heads/numberOfFlips * 100;
		System.out.println("Percentage of heads:" + headsPercentage);
		double tailsPercentage = (double) tails/numberOfFlips * 100;
		System.out.println("Percentage of tails:" + tailsPercentage);
	}
}