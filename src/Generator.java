
public class Generator {
	
	public static String generate(String str1, String str2, String str3)
	{
		int totalLength = str1.length() + str2.length() + str3.length();
		int capLetterPosition = (totalLength)/divider(str1, str2, str3);
		int symbolPosition = (int)Math.sqrt(totalLength); //will not be included now
		String simplePassword = LetterConverter.getLetters(str1, str2, str3);
		for(int i =0; i<=simplePassword.length()-1; i++)
		{
			if(i%capLetterPosition==0)
				simplePassword = simplePassword.substring(0, i) +
							Character.toUpperCase(simplePassword.charAt(i)) +
							simplePassword.substring(i+1, simplePassword.length()-1);
		}
		
		return simplePassword;
		
		
	}
	
	public static int divider (String str1, String str2, String str3)
	{
		if(str1.length()>str2.length() && str1.length()>str3.length())
			return str1.length()/2;
		else
			return (str2.length()>str3.length()) ? str2.length()/2 : str3.length();
	}
//	public static String simplePassword(String str)
//	{
//		String temp = "";
//		if(str.length()<10)
//	}

}
