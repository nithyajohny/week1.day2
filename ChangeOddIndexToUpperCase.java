package week1.day2;

public class ChangeOddIndexToUpperCase {
	/*
	 Pseudo Code

	 * Declare String Input as Follow

	 * String test = "changeme";

	 * a) Convert the String to character array

	 * b) Traverse through each character (using loop)

	 * c)find the odd index within the loop (use mod operator)

	 * d)within the loop, change the character to uppercase, if the index is odd else don't change

	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String test="changeme";
		char[] a = test.toCharArray();
		int length = a.length;
		for (int i=0;i<length;i++)
		{
			if(i%2!=0)
			{ 
				a[i] = Character.toUpperCase(a[i]);
			}
			System.out.print(a[i]);
		 }

	   }
	 }
