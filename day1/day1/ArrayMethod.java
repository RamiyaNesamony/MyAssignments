package week1.day1;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Array decleration
		int[] scores= {100,90,99};
		
		int len= scores.length;
		System.out.println("The length of the Array is:" +len);
		//to retrieve single element
		System.out.println(scores[2]);
		Arrays.sort(scores);
		
		//to get all Values
		for (int i = 0; i < scores.length; i++) 
		{
			System.out.println("The array elememts are :"+scores[i]);
			
		}

	}

}
