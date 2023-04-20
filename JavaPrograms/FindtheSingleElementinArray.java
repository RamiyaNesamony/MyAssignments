package JavaPrograms;

public class FindtheSingleElementinArray
{

	public static void main(String[] args) 
	{
		int[] Arrsingle1= {2,2,1};
		int[] Arrsingle2= {4,1,2,1,2};
		int[] Arrsingle3= {1};
		int len1=Arrsingle1.length;
		int len2=Arrsingle2.length;
		int len3=Arrsingle3.length;
		System.out.println(FindOnceElement(Arrsingle1,len1));
		System.out.println(FindOnceElement(Arrsingle2,len2));
		System.out.println(FindOnceElement(Arrsingle3,len3));
	}
	public static int FindOnceElement(int[] ar,int size)
	{
		for (int i = 0; i < ar.length; i++) 
		{
			int count =0;
			for (int j = 0; j < ar.length; j++)
			{
				//Condition to compare elements
				if (ar[i]==ar[j])
				{
					count++;
				}
				
			}
			if (count==1)
			{
				return ar[i];
			}
		}
		//if none occur once
		return -1;
	
	
	
	}
}
