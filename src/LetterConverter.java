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
			else if(Character.isDigit(current))
			{
				int numberTemp = NumberConverter.getNumber(i,Character.getNumericValue(current));
				generated += (i%2 == 0) ? (char)(topRange-numberTemp) : (char)(lowRange+numberTemp);
			}
		}
		return generated;
	}
	
	public static int getLetterRange(int k)
	{
		if(k<lowRange)
			return topRange - ((lowRange-k)%25); //z - (a -i)%25
		else if(k>topRange)
			return (k-topRange)%25 + lowRange;
		else
			return k;
	}
	
//	public static void main(String[] args)
//	{
////		char c = (char) 35;
//		System.out.println(LetterConverter.getLetters("woolworths", "talentPay", "adnan321"));
//	}

}
