package aggregation;

public class Aggr_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author au = new Author("Chetan Bhagat", "chetanbagat123@gnail.com");
		Book b1 = new Book("Halfgirlfriend",au);
		Book b2 = new Book("2 States",au);
		b1.display();
		b2.display();
	}

}
