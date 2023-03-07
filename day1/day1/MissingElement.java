package week1.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] missing= {1,2,3,4,7,6,8};
		Arrays.sort(missing);
		for (int i = 0; i < missing.length; i++)
		{
			if (missing[i]!=missing[i])
			{
				System.out.println("Missing "+missing[i]);
			}
		}

	}

}
