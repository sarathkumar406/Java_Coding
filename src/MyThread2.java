public void run(){
System.out.println("Thread1");
//Thread.currentThread().join();
}
}
class Thread2 extends Thread{

public void run(){
System.out.println("Thread1");
//Thread.currentThread().join();
}
}
class MyThread2 {
public static void main(String argsp[])
{
Thread1 t1 = new Thread1();
Thread1 t2 = new Thread1();
t1.start();
t2.start();
}
}