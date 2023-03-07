package week1.day1;

public class Calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stubca
		CalculatorMethods obj=new CalculatorMethods();
		//assign o/p to variable shortcut key ctrl+2->release
		
		int mul=obj.mulCalculate(5, 6);
		int sum=obj.addCalculate(10, 20, 30);
		obj.subCalculate();
		
		System.out.println(mul);
		System.out.println(sum);		

	}

}
