
public class TestProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i/p - Hello World, o/p - olleH dlroW
		
		String str = "Hello World";
//		char[] c1 = str
		String[] s = str.split(" ");
		String first = s[0];
		String sec  = s[1];
		char[] c1 = first.toCharArray();
		char[] c2 = sec.toCharArray();
		
		for(int i = c1.length-1;i>=0;i--){
			System.out.print(c1[i]);
		}
		System.out.print(" ");
		
		for(int j = c2.length-1;j>=0;j--){
			System.out.print(c2[j]);
		}
		System.out.println("-------");
		
		for(int i=first.length()-1;i>=0;i--){
			System.out.print(first.charAt(i));
		}
//		
		String test = "This is Java editor";
		revString(test);
		

			
		System.out.print("Checking Merge conflicts - Edited in this branch New1Branch");
		//Keeping both changes			
		System.out.println("Change made in Master Branch");
		
	
	}
	
	public static void revString(String newStr){
		String[] arr = newStr.split(" ");
		
		for(int i=0;i<arr.length;i++){
			
			char[] c = arr[i].toCharArray();
			
			for(int j = c.length-1;j>=0;j--){
				System.out.print(c[j]);
			}
			System.out.print(" ");
			
		}
	}
	
	
}
