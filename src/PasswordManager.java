
public class PasswordManager {
	public static int divider (String str1, String str2, String str3)
	{
		if(str1.length()>str2.length() && str1.length()>str3.length())
			return str1.length()/2;
		else
			return (str2.length()>str3.length()) ? str2.length()/2 : str3.length();
	}
	
	public static String converter(String str1, String str2, String str3)
	{
		//symbol 033 - 047
		//cap 65 - 90 / 10 - 35
		//small 97 - 122 / 10 - 35
		//number 48 - 57
		String password = "";
		int totalLength = str1.length() + str2.length() + str3.length();
		int capLetterPosition = (totalLength)/divider(str1, str2, str3);
		int symbolPosition = (int)Math.sqrt(totalLength);
		String[] data = {str1, str2, str3};
		for(String s: data)
		{
			for(int i = 0; i <= s.length() - 1; i ++)
			{
				char current = s.charAt(i);
				if(Character.isDigit(current))
				{
					int charVal = Character.getNumericValue(current);
					System.out.println("----------------------------------------");
					System.out.println("Current value : "+(char)(i+charVal));
					
					if(true) //if total length is even
					{
						System.out.println(i+"\n");
						password += Character.toString((char)(91 + charVal + i)); // i + real value
					}
					else
					{
						System.out.println("CurrentValue + totalLength : "+(int)Math.sqrt(charVal + totalLength));
						System.out.println("Conversion result "+(char)((int)Math.sqrt(charVal + totalLength)));
						System.out.println("----------------------------------------");
						password +=Character.toString((char)((int)Math.sqrt(charVal + totalLength))); //squareroot of real val + total length
					
					}
				}
				else 
				{
					char letter = s.charAt(i);
					char temp = Character.toLowerCase(letter); //all lower case
//					int tempVal = Character.getNumericValue(temp);
					
					int tempVal = (int)temp;
					int asciiDiff = (122 - tempVal > tempVal - 97) ? 122 - tempVal : tempVal - 97;
					char ready =  (char) (tempVal + asciiDiff);
					password += ready;
				}
			}
		}
		
		return password; //change
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(args.length != 3)
//		{
//			System.out.println("Insufficient information to generate password");
//		}
//		else
//			System.out.println( converter(args[0], args[1], args[2]));
		char c = (char)'a';
		System.out.println(c+"\n");
	}

}
