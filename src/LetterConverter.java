// (int) char =========> get the ASCII value of the character

public class LetterConverter {
	static int lowRange = 97;
	static int topRange = 122;
	
	public static String getLetters(String str1, String str2, String str3)
	{
		String input = str1+str2+str3;
		String generated =  "";
		for(int i =0; i<=input.length()-1; i++)
		{
			char current = Character.toLowerCase(input.charAt(i)); //everything into lower case
			if(!Character.isDigit(current))
			{
				int temp = (int) current + ((int)Math.sqrt(input.length()) - i);
				int rangeTemp = getLetterRange(temp);
				generated += (char)rangeTemp;
			}
		}
		return generated;
	}
	
	public static int getLetterRange(int k)
	{
		if(k<lowRange)
			return (k + lowRange)%topRange;
		else if(k>topRange)
			return (k%topRange + lowRange);
		else
			return k;
	}
	
	public static void main(String[] args)
	{
//		char c = (char) 35;
		System.out.println(LetterConverter.getLetters("coles", "payroll", "adnaan"));
	}

}