package basicProg;

public class OneToHunWithoutLoops {
	
	public static void printNum(int start,int end)
	{
		while(start<=end)
		{
			System.out.print(start+" ");
			start ++;
			//printNum(start, end);
		}
		
	}
	
	public static void printNum2(int start,int end)
	{
		if(start<=end)
		{
			System.out.print(start+" ");
			start ++;
			printNum2(start, end);
		}
		
	}
	
	public static void main(String[] args){
	
		int start = 1;int end=100;
		printNum(start,end);
		System.out.println("---------------");
		printNum2(start,end);
		
		
		
	}

	
}
