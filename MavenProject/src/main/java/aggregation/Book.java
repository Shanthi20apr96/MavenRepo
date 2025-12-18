package aggregation;

public class Book {
	String title;
	Author author;//datatye variable name
	Book(String title, Author author){
		this.title = title;
		this.author = author;
		
	}
void display() {
	System.out.println(title);
	System.out.println(author.name);
	System.out.println(author.emailID);
}
}
