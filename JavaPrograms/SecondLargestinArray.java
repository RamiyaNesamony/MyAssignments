package JavaPrograms;

import java.util.Arrays;

public class SecondLargestinArray {

	public static void main(String[] args)
	{
		int[] numbers= {2,19,80,91};
		Arrays.sort(numbers);
		System.out.println(numbers[numbers.length-1]);
	}

}
