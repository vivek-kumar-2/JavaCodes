class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("i am a thread not threat");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("i am a thread2 not threat2");
    }
}
public class Implementing_Runnable_Thread {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();  //runnable
              Thread gun1=new Thread(bullet1);              //runnable
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
             Thread gun2=new Thread(bullet2);
             gun1.start();
             gun2.start();

    }
}
