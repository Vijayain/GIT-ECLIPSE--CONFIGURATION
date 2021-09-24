package oopsss;



class test{
	void show() {
		System.out.println("parent class method executed");
	}
}
class test2 extends test {
	void show() {
		System.out.println("child class overridden method executes");
	}
	public static void main(String args[]) {
		test t=new test();
		t.show();
		test2 t2=new test2();
		t2.show();
	
}
	}