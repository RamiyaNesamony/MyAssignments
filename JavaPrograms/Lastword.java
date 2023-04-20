package JavaPrograms;

public class Lastword {

	public static void main(String[] args) 
	{
		String s1="Hello World";
		String s2="fly me   to   the moon";
		String s3="luffy is still joyboy";
		
		//1.using Split(" ")
		
		String[] parts=s1.split(" ");
		String lastWord1 =parts[parts.length-1];
		System.out.println(lastWord1.length());
		
		String[]part2=s2.split(" ");
		String lastWord2=part2[part2.length-1];
		System.out.println(lastWord2.length());
		
		//2.Using SubString
		
		String lastWord3 =s3.substring(s3.lastIndexOf(" ")+1);
		System.out.println(lastWord3.length());
		

	}
}
