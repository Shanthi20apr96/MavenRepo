package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object using child class as list is an interface  does not support object creation
		List<String> student = new ArrayList<String>();
		student.add("Shanthi");
		student.add("Prasad");
		student.add("Andrews");
		student.add("paul");
		System.out.println(student);
		//methods 
		//get - to access an element using index
		System.out.println(student.get(0));
		//size
		System.out.println(student.size());
		//contains
		System.out.println(student.contains("Shanthi"));
		//remove
		System.out.println(student.remove(0));
		for(String i : student) {
			System.out.println(i);
				
		}
		
		
	}

}
