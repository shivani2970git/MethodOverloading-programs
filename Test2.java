class Test2 {
	void show(int a) {
		System.out.println("this is int method");
	}
	void show(String a) {
		System.out.println("this is string method");
	}
	public static void main(String args[]) {
		Test2 t=new Test2();
		t.show('a');
	}

}
//its happens because type promotion
//like short,byte,char promoted into int
//int is promoted into float,long,double
//float is promoted into double
//long is promoted double