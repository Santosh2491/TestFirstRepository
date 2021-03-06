package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CopyHashMpaToHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> m1 =new HashMap<Integer,String>();
		m1.put(1, "One");m1.put(6,"Six");m1.put(5,"Five");
		m1.put(2,"Two");m1.put(4, "Four");m1.put(3,"Three");m1.put(8,"Eight");
		
		Map<Integer,String> m2 =new HashMap<Integer,String>();
		
		Set<Map.Entry<Integer,String>> s1 = m1.entrySet();
		
		for(Map.Entry<Integer,String> ent:s1){
			m2.put(ent.getKey(), ent.getValue());
		}
		
		System.out.println(m2);
	}

}
