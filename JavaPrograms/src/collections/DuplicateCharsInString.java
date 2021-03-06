package collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		String str = "OneSeleniumTest";
		char[] c = str.toCharArray();
		
		/****** Linked Hash set *******/
		Set<Character> s1 = new LinkedHashSet<Character>();
		for(Character s:c){
			if(s1.add(s)==false){
				System.out.println(s);
//				break; //Gives the first duplicate char in string
			}
//			s1.add("Duplicate chars are: "+s);
		}
		System.out.println(s1);
		System.out.println("----------------------");
		
		/****** Hash Map *******/
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(Character s:c){
			if(hm.containsKey(s)){
				hm.put(s, hm.get(s)+1);
				
			}
			else{
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
		
		Set<Map.Entry<Character, Integer>>ent = hm.entrySet();
		for(Map.Entry<Character, Integer> e:ent){
			if(e.getValue()>1){
				System.out.println(e.getKey());
			}
		}
		

	}

}
