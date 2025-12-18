package interfaces;

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dog dog = new Dog();
		//upcasting
		Pet pe = new Dog();
		pe.test();
		pe = new Cat();
		pe.test();
	}

}
