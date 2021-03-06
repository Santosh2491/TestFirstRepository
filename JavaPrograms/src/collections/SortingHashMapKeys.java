package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingHashMapKeys {

	public static void main(String[] args) {
		
		Map<Integer,String> m1 =new HashMap<Integer,String>();
		m1.put(1, "One");m1.put(6,"Six");m1.put(5,"Five");
		m1.put(2,"Two");m1.put(4, "Four");m1.put(3,"Three");m1.put(8,"Eight");
		
		System.out.println("HashMap elements: "+m1);
		
		//****** Sorting by Keys *****//
		List<Integer> l1 = new ArrayList<Integer>(m1.keySet());
		System.out.println(l1);
		//Collections.sort(l1);
		System.out.println("Sorted ArrayList: "+l1);
		
		for(Integer s:l1){
			System.out.println("Key: "+s+" Value: "+m1.get(s));
		}

	}

}
