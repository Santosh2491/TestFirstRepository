package basicProg;

public class SwapFirslLast_ReverseMiddleWords {

	public static void main(String[] args) {
		
		String str = "Hello this is the GFG user";
		String[] strArray = str.split(" ");
		String temp=strArray[0];
		strArray[0]=strArray[strArray.length-1];
		strArray[strArray.length-1]=temp;
		
		System.out.print(strArray[0]+" ");
		for(int j=strArray.length-2;j>=1;j--){
			char[] c =strArray[j].toCharArray();
			
			for(int k=c.length-1;k>=0;k--){
				System.out.print(c[k]);
				
			}
			System.out.print(" ");
		}
		System.out.println(strArray[strArray.length-1]);
		
//		for(String sa: strArray){
//			System.out.print(sa+" ");
//		}
		
		
		

	}

}
