package setDemo;

import java.util.HashSet;
import java.util.Iterator;

public class IterateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> colors = new HashSet<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("blue");
		colors.add("black");
		System.out.println(colors);
		Iterator<String> var = colors.iterator();
		while(var.hasNext()) {
			System.out.println(var.next());
		}
		var.remove();
		System.out.println(colors);
	}

}
