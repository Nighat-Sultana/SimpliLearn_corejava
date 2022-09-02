package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//String[] array1 = {"abc", "pqr", "xyz"};
		//System.out.println(array1.length);
		
		ArrayList<String>list1 = new ArrayList<String>();
		list1.add("John");
		list1.add("Leeana");
		list1.add("Nancy");
		list1.add("Sara");
		list1.add("Rae");
		
		
		System.out.println("List is this " + list1);
		System.out.println("Size of Array List is:  "+list1.size());

		list1.remove(1);
		
		System.out.println("List is this after removing Leeana " + list1);
		System.out.println("Size of Array List is:  "+list1.size());
		
		
		System.out.println("The data at the 4th position is: " + list1.get(3));
		
		list1.set(0, "James");
		System.out.println("List of this after replacing John "+list1);
		
		list1.add(1, "Leeana");
		System.out.println("List is this after adding Leeana again "+list1);
		
		
		/*Collections.sort(list1); //sort the list in ascending order
		System.out.println("List is this after sort "+list1);
		
		
		Collections.reverse(list1); //sort the list in descending
		System.out.println("List is after revarse "+list1); //for make gap*/
		
		System.out.println(); //for make gap
		for(int index=0; index<list1.size();index++) {
			System.out.println(list1.get(index));
		}
		System.out.println(); //for make gap
	
		for(String name:list1) {
			System.out.println(name);
		}
	
		System.out.println();	
		
		
		//need to find out in which position is Sara
		for(int index=0; index<list1.size();index++) {
			if(list1.get(index).equals("Sara")) {
				System.out.println(index);
				//break;
			}
		
		//ArrayList<Integer>list2 = new ArrayList<Integer>();
		
		}
	}
}


