package week1.day1;

import java.util.Iterator;

public class PrintDuplicateInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] dupl= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//int count=0;
		int len= dupl.length;
		for (int i = 0; i < len; i++)
		{
			for (int j =i+1; j < len-1; j++) 
			{
				
			if (dupl[i]==dupl[j]) 
			{
				System.out.println("The matching values in array are:" +dupl[i]);
			}	
			}
			
			
		}
		
		

	}

}
