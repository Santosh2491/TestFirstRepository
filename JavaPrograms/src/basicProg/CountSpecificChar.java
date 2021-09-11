package basicProg;

public class CountSpecificChar {
	
	public static void countOccurence(String str, char val)
	{
		int count=0;
		
		for(char c: str.toCharArray())
		{
			if(c==val)
				count++;
		}
		System.out.println("Character count: "+count);
	}

	public static void main(String[] args) {
		
		String str= "This is for java programming and checking in eclipse";
		
//		Without creating any method
//		char[] ch = str.toCharArray();
//		int count=0;

//		for(char c: ch)
//		{
//			if(c=='a')
//				count++;
//		}
//		System.out.println("Character count: "+count);
		
//----	Creating method----
		countOccurence(str,'e');
	}
}
