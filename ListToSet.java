package JavaProgramms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a list
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);// duplicate element

		// convert a list to set
		Set<Integer> set = new HashSet<>(list);

		// print the element of a set using for loop
		System.out.println("Set elements");
		for (int element : set) {
			System.out.println(element);
		}
		
		//iterate using while loop
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			int element=itr.next();
			System.out.println(element);
		}

	}

}
