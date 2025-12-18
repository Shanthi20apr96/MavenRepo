package exception;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int ar[] = new int[5];
			ar[6] = 20/0;
		
	}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
		catch(Exception ex) {
			//base exception class
			ex.printStackTrace();
		}
		
}
}
