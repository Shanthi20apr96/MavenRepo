package setDemo;

import java.util.HashSet;

public class SetDemoPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruit = new HashSet<>();
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Pear");
		fruit.add("Kiwi");
		fruit.add("Pineapple");
		System.out.println(fruit);
		HashSet<String> colors = new HashSet<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("blue");
		colors.add("black");
		System.out.println(colors);
		//method1
		colors.addAll(fruit);
		System.out.println(fruit);
		System.out.println(colors);
		//method 2
		System.out.println(colors.containsAll(fruit));
		System.out.println(fruit.containsAll(colors));
		//method 3
		System.out.println(colors.removeAll(fruit));
		System.out.println(colors);
	}

}
