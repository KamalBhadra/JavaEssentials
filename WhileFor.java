package JavaProgramms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Kamal");
		map.put(2,"Geeta");
		map.put(3,"Shraddha");
		map.put(4,"Sheevji");
		System.out.println(map.size());
		System.out.println("while loop");
		Iterator itr=map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println("Key is"+me.getKey()+"Value is"+me.getValue());
			
		}
		System.out.println("For loop");
		for(Map.Entry me2: map.entrySet()) {
			System.out.println("Key is"+me2.getKey()+"Value is"+me2.getValue());
		}
		

	}

}
