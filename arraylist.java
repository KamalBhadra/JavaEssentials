package JavaProgramms;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.size());
		System.out.println("While loop");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("advanced forloop");
		for(Object x:list) {
			System.out.println(x);
		}
		System.out.println("for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
