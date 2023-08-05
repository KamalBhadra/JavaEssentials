package JavaProgramms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		// Create a set
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);

		// convert the set to list
		List<Integer> list = new ArrayList<>(set);

		// Iteration Using Enhanced for loop
		System.out.println("Enhanced for loop");
		for (int element : list) {
			System.out.println(element);
		}
		// Iteration using normal for loop
		System.out.println("Normal for loop");
		for (int i = 0; i < list.size(); i++) {
			int element = list.get(i);
			System.out.println(element);
		}
		// Iteration using a while loop
		System.out.println("While loop");
		int count = 0;
		while (count < list.size()) {
			int element = list.get(count);
			System.out.println(element);
			count++;
		}
		
		//while loop using iterator
		System.out.println("Using Iterator print list elements");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
