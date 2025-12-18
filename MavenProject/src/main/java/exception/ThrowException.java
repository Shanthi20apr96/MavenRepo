package exception;

public class ThrowException {
	// declare exception prior to execution, informing the chances of getting an exception
	public static void validate(int age) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		if(age<18) {
			throw new ArithmeticException("you are not eligible to vote");
		}else
			System.out.println("you are eligible to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(15);
		}catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("HII");
	}

}
