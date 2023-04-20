package JavaPrograms;

public class SquareRoot {

	public static void main(String[] args)
	{
		/*
		 * int sqrt=81; System.out.println(Math.sqrt(sqrt));
		 */
		//temporary variable 
		System.out.println("Square root of number is " + squareRoot(4));
		System.out.println("Square root of number is " + squareRoot(8));
	}
	public static double squareRoot(int number)
	{
		double temp;

		double sr = number / 2;

		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	    }

}
