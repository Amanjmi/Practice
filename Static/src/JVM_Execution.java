
public class JVM_Execution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		System.out.println(a);
		System.out.println(b);
		disp();
	}
	
	static int a;
	static int b;
	
	static
	{
		System.out.println("Static block");
		a=10;
		b=20;
	}
	static void disp()
	{
		System.out.println("Static disp method");
		System.out.println(a);
		System.out.println(b);
	}
	
	


}


//class Demo
//{
//	static int a;
//	static int b;
//	static 
//	{
//		System.out.println("Static block");
//		a=10;
//		b=20;
//	
//	}
//	static void disp()
//	{
//		System.out.println("Static method");
//		System.out.println(a);
//		System.out.println(b);
//	}
//	int x;
//	int y;
//	
//	{
//		x=10;
//		y=20;
//		System.out.println("Non static Java blick");
//	}
//	Demo()
//	{
//		
//		System.out.println("Constructor");
//	}
//	void disp1()
//	{
//		System.out.println("Non static method");
//		System.out.println(x);
//		System.out.println(y);
//		
//	}
//	void disp2()
//	{
//		disp1();
//	}
//}
//
//public class JVM_Execution 
//{
//
//	public static void main(String[] args) {
//		Demo.disp();
//		System.out.println("Main method");
//		
//		Demo d=new Demo();
//		d.disp();
//		d.disp1();
//		
//
//	}
//
//}

