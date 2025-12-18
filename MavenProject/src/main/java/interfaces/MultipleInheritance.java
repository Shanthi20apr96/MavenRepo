package interfaces;

public class MultipleInheritance implements Show, Detail {
	public void show(String name, int age) {
		System.out.println(name);
		System.out.println(age);
		
	}
}	
