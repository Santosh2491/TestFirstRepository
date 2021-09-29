package collections;

import java.util.HashMap;
import java.util.Map;

public class StringToHashMap {

	public static void main(String[] args) {
		
		String studentData = "A:201,B:202,C:203,D:204,E:205";
		String[] indData = studentData.split(",");
		String[] name = new String[indData.length];
		Integer[] rollNo = new Integer[indData.length];
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		for(int i=0;i<indData.length;i++){
			String[] s = indData[i].split(":");
			name[i] = s[0];
			rollNo[i] = Integer.parseInt(s[1]);
			System.out.println(name[i]+"--"+rollNo[i]);
			
			hm.put(rollNo[i], name[i]);
		}
		System.out.println("----------------");
		System.out.println(hm);
		
	}

}
