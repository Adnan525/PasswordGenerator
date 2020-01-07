
public class PasswordManager {

	public static void main(String[] args) {
		if(args.length != 3)
		{
			System.out.println("Insufficient information to generate password");
		}
		else
			System.out.println(Generator.generate(args[0], args[1], args[2]));
	}

}
