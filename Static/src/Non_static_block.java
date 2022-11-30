//
//public class Non_static_block {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}


class Demo1
{
	int a;
	int b;
	
	static int count;
	
	
	{
		count++;
		System.out.println("Hello");
	}
	
	Demo1()
	{
	
		System.out.println("First con");
	}
	Demo1(int a)
	{
		System.out.println(a);
		System.out.println("3rd con");
		this.a=a;
		
	}
	Demo1(int a, int b)
	{
		System.out.println("2nd con");
		this.a=a;
		this.b=b;
	}
}


public class Non_static_block {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1(10,20);
		Demo1 d3=new Demo1(10);
		
		System.out.println(Demo1.count);

	}

}
