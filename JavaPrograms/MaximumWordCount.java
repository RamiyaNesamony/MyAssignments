package JavaPrograms;

public class MaximumWordCount
{
public static void main(String[] args)
{
	String [] sentence= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
	String [] sentence1= {"please wait", "continue to fight", "continue to win"};
	System.out.println("Maximum Number of Words:" + countMaximumWords(sentence));
	System.out.println("Maximum Number of Words:" + countMaximumWords(sentence1));
}
public static int countMaximumWords(String[] sentence) 
{
	int maxCount=0;
	for (int i = 0; i < sentence.length; i++)
	{
		String eachSentence =sentence[i];
		String[] words=eachSentence.split(" ");
		int wordCount = words.length;
		if (wordCount >maxCount) 
			maxCount=wordCount;
	}
	return maxCount;
	
}

}
