class Student1 {
   void show(int a,int b) {
	   System.out.println("this is first method");
   }
   void show(int c, String b)
   {
	   System.out.println("this is second method");
   }
   public static void method(String args[]) {
	   Student1 s=new Student1();
	   s.show(10,20);
	   s.show(30, "pooja");
   }

}