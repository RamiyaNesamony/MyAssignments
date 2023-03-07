package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int num =7;
		boolean flag = false;
		for (int i = 2; i < num/2; i++)
		
		{
		//condition for Prime
			if (num% i==0) 
			{
			flag=true;
			System.out.println("The given number is not Prime");
			break;
			
			} 
			else
			
			{
				System.out.println("The given number is Prime");
			}
			
		}

	}

}
