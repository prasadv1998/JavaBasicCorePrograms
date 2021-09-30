package javaprograms;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		System.out.println("Enter number of columns");
		int column = sc.nextInt();
		int a[][] = new int [row][column];
		System.out.println("Enter " + row*column + " Elements to Store in Array :");
			for (int i = 0; i < row; i++) 
        {
        	for(int j = 0; j < column; j++) 
        	{
        		a[i][j] = sc.nextInt();
        	}
        }
        System.out.println("Elements in Array are :");
        	for (int i = 0; i < row; i++) 
        {
        	for(int j = 0; j < column; j++)
        	{
        		System.out.print(" "+a[i][j]);
        	}
        	System.out.println();
        }
        sc.close();
   }
}