package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class IdentifyingDuplicateCharsInStringArray {

	public static void main(String[] args) {
		
		String[] arr = {"d","a","b","c", "a","b","c","d"};
		
		/******* Hash set ***********/
		Set<String> hs1 = new HashSet<String>();
		for(String s:arr){
			if(hs1.add(s)==false)
			{
				System.out.println(s);
			}
		}
		System.out.println("-----------------");
		
		/******* Linked Hash set ***********/
		Set<String> lhs1 = new LinkedHashSet<String>();
		for(String s:arr){
			if(lhs1.add(s)==false)
			{
				System.out.println(s);
			}
		}
	}
}
