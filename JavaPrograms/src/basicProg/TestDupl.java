package basicProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestDupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num ={1,2,3,4,1,2,3,4};
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4));
		Set<Integer> s1 = new HashSet<Integer>(list1);	
		System.out.println(s1);
		List<Integer> list2 = new ArrayList<Integer>(s1);
		System.out.println(list2);
		
		List<Integer> l1= list1.stream().distinct().collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.println("Master edited");
		
		//-------------------------------
		System.out.println("Master edited after creating new1");
		
		//-------------------------------
		System.out.println("Master edited after 1st Commit");
		
		//-------------------------------
		System.out.println("Master edited after 2nd Commit");
		
		
	}
	
	
}
