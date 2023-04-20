package JavaPrograms;

public class JewelsInStones {

	public static void main(String[] args)
	{
		String Jewel1="aA";
		String Stone1="aAAbbbb";
		String Jewel2="z";
		String Stone2="ZZ";
		System.out.println("Number of Jewels in Stones :" + identifyJewels(Jewel1, Stone1));
		System.out.println("Number of Jewels in Stones :" + identifyJewels(Jewel2, Stone2));

	}
	
	public static int identifyJewels(String Jewel,String Stone)
	{
		int output=0;
		for (int i = 0; i < Jewel.length(); i++) 
		{
			for (int j = 0; j < Stone.length(); j++)
			{
				if (Jewel.charAt(i)==Stone.charAt(j)) 
					output ++;
			}
		}
		return output;
		
	}

}
