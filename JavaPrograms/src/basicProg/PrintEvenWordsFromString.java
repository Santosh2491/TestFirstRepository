package basicProg;

public class PrintEvenWordsFromString {

	public static void main(String[] args) {
		String str = "This is Java language and editor is eclipse";
		String[] strArr = str.split(" ");
		
		
		for(String s:strArr){
			if(s.length()%2==0){
				System.out.print(s+" ");
			}
		}

	}

}
