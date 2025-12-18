package exception;

public class LibrarySystem {
	public static void borrowBook(int count) throws ArithmeticException {
		if(count <= 0) {
			throw new ArithmeticException("Invalid book count");
		}
		else if(count >5) {
			throw new ArithmeticException("Limit exceeded");
		}
		else {
			System.out.println("Valid book count");
		}
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			borrowBook(15);
		}catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		finally {
		System.out.println("Connection closed");
	}
	}

}
