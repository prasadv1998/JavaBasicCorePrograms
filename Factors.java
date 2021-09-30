package javaprograms;

public class Factors {
	public static void main(String []args){
	     int number = 21;
	     System.out.print("Prime factors of 21 = ");
	     for(int i = 2; i< number; i++) 
	     {
	         while(number%i == 0) 
	         {
	            System.out.print(i+",");
	            number = number/i;
	         }
	     }
	      if(number >2) 
	      {
	         System.out.println(number);
	      }
	   }
}