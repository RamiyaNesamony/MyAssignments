package week1.day1;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums= {2,2,3,4,5,6,6,8,8,8};
		Arrays.sort(nums);
		//outer loop i
		//innerloop next number
		//compare both loop using if
		//print duplicate value
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i+1; j < nums.length-1; j++) 
			{
				if (nums[i]==nums[j]) 
				{
					System.out.println("Duplicate Values" + nums[i]);
				}
			}
		}
		
		
			

	}

}
