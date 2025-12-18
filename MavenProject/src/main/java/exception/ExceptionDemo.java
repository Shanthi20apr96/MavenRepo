package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before exception");
		try{
			int num = 30/0;
		}
		catch(ArithmeticException ae) {
			//ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("Connection closed");
		}
		
		System.out.println("After exception");
		
	}

}
