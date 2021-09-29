package basicProg;


public class InheritanceConcept_Imp {
	
	public static void main(String[] args) {
		Test1 t2 = new Test2();
		t2.m1();
		System.out.println("-----------------");
		Test1 t1 = new Test1();
		t1.m1();
		Test1 t12 = new Test2();
		//t12.m3();//Error displayed as Reference is of Super class and object of subclass and trying to access sub class method

	}
}


class Test1{
	public void m1(){
		System.out.println("Test1----m1");
		m2();
	}
	public void m2(){
		System.out.println("Test1----m2");
	}
}

class Test2 extends Test1{
	public void m1(){
		System.out.println("Test2----m1");
		super.m1();
	}
	public void m2(){
		System.out.println("Test2----m2");
	}
	public void m3(){
		System.out.println("Test2----m3");
	}
}


	
	
