package methodoverrriding;

public class surgeon extends Doctor{
	public void treatPatients() {
	System.out.println("fixed surgeon next week");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d = new Doctor();
		d.treatPatients();
		surgeon s = new surgeon();
		s.treatPatients();
	}

}
