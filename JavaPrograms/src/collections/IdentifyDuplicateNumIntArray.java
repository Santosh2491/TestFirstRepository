package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IdentifyDuplicateNumIntArray {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,1,2};
		
		/**** Hash set ****/
		Set<Integer> s1 = new HashSet<Integer>();
		for(Integer in: n)
		{
			if(s1.add(in)==false){
				System.out.println(in);
			}
		}

		System.out.println("------------------");
		
		/**** Hash Map ****/
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(Integer in: n){
			if(hm.containsKey(in)){
				hm.put(in, hm.get(in)+1);
			}
			else{
				hm.put(in, 1);
			}
		}
		
		System.out.println("Occurence of each number is: "+hm);
		
		Set<Map.Entry<Integer,Integer>> sen = hm.entrySet();
		for(Map.Entry<Integer,Integer> ent: sen){
			if(ent.getValue()>1){
				System.out.println(ent.getKey());
			}
		}
		
	}

}
