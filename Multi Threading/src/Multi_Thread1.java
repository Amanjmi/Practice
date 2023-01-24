//class MThread extends Thread{
//public void run(){
//System.out.println("run method");
//}
//public void start(){
//System.out.println("start method");
//}
//}
//class Multi_Thread1{
//public static void main(String... args){
//MThread t=new MThread();
//
//t.start();
//System.out.println("Main method");
//}
//}


//class ThreadB extends Thread{
//int total =0;
//@Override
//public void run(){
//for (int i=0;i<=100 ; i++){
//total+=i;
//}
//}
//}
//public class Multi_Thread1 {
//public static void main(String[] args)throws InterruptedException {
//ThreadB b=new ThreadB();
//b.start();
//Thread.sleep(1);
////stmt-1;
//System.out.println(b.total);
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
public class Multi_Thread1 {
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