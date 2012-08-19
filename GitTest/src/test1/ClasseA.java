package test1;


public class ClasseA {

	/**
	 * 
	 */
	public void methodA1() {
		methodA2();
		methodA3();
	}

	public void methodA2() {
		ClasseB b = new ClasseB();
		b.methodB1();
	}

	public void methodA3() {
		
	}
}
