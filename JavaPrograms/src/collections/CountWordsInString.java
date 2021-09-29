package collections;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is This done with Collections";
		
		String[] sp = str.split(" ");
		System.out.println("String length: "+sp.length);
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(String s:sp){
			if(m.containsKey(s)){
				m.put(s, m.get(s)+1);
			}
			else{
				m.put(s, 1);
			}
		}
		System.out.println(m);
	}

}
