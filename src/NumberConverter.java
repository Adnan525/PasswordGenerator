
public class NumberConverter {
	
	public static int getNumber(int i, int k)
	{
		int temp = (int)(Math.PI* Math.sqrt(i+k * Math.sqrt(i+k)))%9;
		return Integer.parseInt((Integer.toOctalString(temp)));
	}

}
