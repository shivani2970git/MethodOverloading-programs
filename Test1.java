class Test1 {
	public static void main(int a) {
		System.out.println(1);
	}
	public static void main(String args[]) {
		System.out.println(2);
		Test1 t=new Test1();
		t.main(10);
	}

}
//we can overload any method by using method overloading in a class.