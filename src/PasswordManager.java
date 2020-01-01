
public class PasswordManager {
	public int divider (String str1, String str2, String str3)
	{
		if(str1.length()>str2.length() && str1.length()>str3.length())
			return str1.length()/2;
		else
			return (str2.length()>str3.length()) ? str2.length()/2 : str3.length();
	}
	
	public String converter(String str1, String str2, String str3)
	{
		//symbol 033 - 047
		//cap 65 - 90
		//small 97 - 122
		//number 48 - 57
		
		int totalLength = str1.length() + str2.length() + str3.length();
		int capLetterPosition = (totalLength)/divider(str1, str2, str3);
		int symbolPosition = (int)Math.sqrt(totalLength);
		String[] data = {str1, str2, str3};
		for(String s: data)
		{
			for(int i = 0; i <= s.length() - 1; i ++)
			{
				char letter = s.charAt(i);
				char temp = Character.toLowerCase(letter); //all lower case
				Character.getNumericValue(temp);
			}
		}
		
		return null; //change
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3)
		{
			System.out.println("Insufficient information to generate password");
		}
	}

}
