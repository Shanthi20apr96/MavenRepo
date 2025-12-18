package static_keyword;

public class static_class {
	String name;
	int rollnumber;
	static String schlname = "ABC";
	static_class (String name, int rollnumber){ 
		this.name = name;
		this.rollnumber = rollnumber;
}
void display() {
	System.out.println(name+rollnumber+schlname);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_class obj1 = new static_class("Shanthi", 40);
		obj1.display();

	}

}
