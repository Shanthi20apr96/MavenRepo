package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pineapple");
		System.out.println(fruits);
		System.out.println(fruits.get(0));
		System.out.println(fruits.set(2,"Kiwi"));
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.isEmpty());
		Collections.sort(fruits);
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);
	}

}
