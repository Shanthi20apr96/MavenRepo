package superkeyword;

public class class_use3 extends Parent_use3 {
	int num =200;
	void display() {
			System.out.println(num);
			System.out.println(super.num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_use3 obj1 = new class_use3();
		obj1.display();
	}

}
