//interface Techno {
//	public abstract void Aman();
//}
//class mris implements Techno {
//	public  void Aman(){
//		System.out.println("Amaan");
//	}
//}
//public class Interface1 {
//
// public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Techno a =new mris();
//
//	}
//
//}


interface Runnable{
public abstract void run();
}
class Thread implements Runnable{
public void start(){
//1. register Thread with ThreadScheduler
//2. All other mandatory low level activites
//3. invoke run()
}
public void run(){
//empty implementation
}
}
//eg::1
class MyRunnable implements Runnable{
@Override
public void run(){
for(int i=1;i<=10;i++)
System.out.println("child thread");

}
}
public class Interface1{

public static void main(String... args){
MyRunnable r=new MyRunnable();
Thread t=new Thread(r);//call MyRunnable run()
t.start();
for(int i=1;i<=10;i++)
System.out.println("main thread");

}
}