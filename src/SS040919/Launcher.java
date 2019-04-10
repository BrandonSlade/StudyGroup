package SS040919;

public class Launcher {
	
	public static void main(String[] args) {
		
//		try {
//			Launcher.Divider(5, 0);
//		}
//		catch(ArithmeticException exception1){
//			System.out.println("Number can not be divided by zero");
//		}
//		finally {
//			System.out.println("Thanks for using the divider!");
//		}
		
		try {
			Launcher.JameBond("007");
		}catch(SecretAgentException exception){
			System.out.println("Hello, Mr. Bond");
		}
		finally {
			System.out.println("Thank you for using my method.");
		}
	}
	
	public static int Divider(int dividend, int divisor) {
		return dividend/divisor;
	}
	public static void JameBond(String word) throws SecretAgentException{
		if(word == "007") {
			throw new SecretAgentException();
		}
	}

}
