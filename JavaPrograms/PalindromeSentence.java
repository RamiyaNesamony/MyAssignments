package JavaPrograms;

public class PalindromeSentence {

	public static void main(String[] args)
	{
		
		System.out.println("Example1 " + CheckPalindrome("A man, a plan, a canal: Panama"));
		System.out.println("Example2 " + CheckPalindrome("race a car"));
		System.out.println("Example3 " + CheckPalindrome(""));		

	}
	public static boolean CheckPalindrome(String sent)
	{
		String sent1=sent.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		String rev ="";
		int len1=sent1.length();
		for (int i =len1-1 ; i >= 0 ; i--) 
		{
			rev=rev+sent1.charAt(i);
		}
		if(sent1.equals(rev))
		{
			return true;
		}
		else
		{
			
		return false;
		}
		
	}

}
