package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FibonacciSeries without recurssion
		//variable decleration
		int n1=0,n2=1,n3,i,count=10;
		System.out.println("Fibonacci Series");
		System.out.println(n1+ " ");
		//loop for doing calculation
		for (int j = 2; j < count; ++j) //starting from 2 as 0&1 printed already
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
