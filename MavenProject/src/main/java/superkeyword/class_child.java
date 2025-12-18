package superkeyword;

public class class_child extends Parent_class{
	void display() {
		System.out.println("Child class method");
		
	}
	void details() {
		super.display();
		System.out.println("another method");
	}
public static void main(String[] args)
	{
	class_child obj = new class_child();
	obj.details();
	obj.display();
}
}
