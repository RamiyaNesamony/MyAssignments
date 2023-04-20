package JavaPrograms;

public class FindMajorityElement {

	public static void main(String[] args)
	{
		int[] arr1= {3,2,3};
		int n1=arr1.length;
		int[] arr2= {2,2,1,1,1,2,2};
		int n2=arr2.length;
		
		int output1 =	majorityElement(arr1,n1);
		System.out.println("The majority element is " + output1);
		int output2 =	majorityElement(arr2,n2);
		System.out.println("The majority element is " + output2);
		
	}
	
	public static int majorityElement(int arr[],int n)
	{
		for (int i = 0; i < n; i++) 
		{
			int majorityCount=0;
			for (int j = 0; j < n; j++)
			{
				if (arr[i]==arr[j]) 
				
					majorityCount=majorityCount+1;
				
				
			}
			if (majorityCount>=n/2)
			
				return arr[i];
			
		}
		return n;
		
		
	}

}
