//
//class Display{
//public synchronized void wish(String name){
//for (int i=1;i<=5 ;i++ )
//{
//System.out.print("Good Morning: ");
//try{
//Thread.sleep(1000);
//}
//catch (InterruptedException e){
//}
//System.out.println(name);
//
//}
//}
//}
//class MyThread extends Thread{
//Display d;
//String name;
//MyThread(Display d,String name){
//this.d=d;
//this.name=name;
//}
//@Override
//public void run(){
//d.wish(name);
//
//}
//}
//public class  LockChecking {
//public static void main(String... args)throws InterruptedException{
//Display d=new Display();
//{
//MyThread t1= new MyThread(d,"dhoni");
//MyThread t2= new MyThread(d,"yuvi");
//t1.start();
//t2.start();
//}
//}
//}

class ThreadB extends Thread{
int total =0;
@Override
public void run(){
synchronized(this){
System.out.println("Child thread started calculation");
for (int i=0;i<=100 ; i++){
total+=i;
}
System.out.println("Child thread trying to give notification");
this.notify();
}
}
}
public class LockChecking {
public static void main(String[] args)throws InterruptedException {
ThreadB b=new ThreadB();
b.start();
//Thread.sleep(1000);//10sec
synchronized(b){
System.out.println("Main thread is calling wait on B object");
b.wait();
System.out.println("Main thread got notification");
System.out.println(b.total);
}
}
}
