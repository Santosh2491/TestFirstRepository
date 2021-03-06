package collections;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagramsUsingHashMap {
	
	public static void checkAnagarms(String s1,String s2){
		Map<Character,Integer> hm1 = new HashMap<Character,Integer>();
		Map<Character,Integer> hm2 = new HashMap<Character,Integer>();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		for(Character c:c1){
			if(hm1.containsKey(c))
				hm1.put(c, hm1.get(c)+1);
			else
				hm1.put(c, 1);
		}
		System.out.println(hm1);
		System.out.println("---------------");
		
		for(Character c:c2){
			if(hm2.containsKey(c))
				hm2.put(c, hm2.get(c)+1);
			else
				hm2.put(c, 1);
		}
		System.out.println(hm2);
		
		if(hm1.equals(hm2))
			System.out.println("Strings are Anagrams");
		else
			System.out.println("Strings are not Anagrams");
	}

	public static void main(String[] args) {
		
		String s1 = "GeeksForGeeks";
		String s2 = "GeeksGeeksFor";
		
		checkAnagarms(s1,s2);
			
	}
	

}
