class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4)
        System.out.println("my thread is running");
        System.out.println("i am happy");
        i++;
    }
}
class MyThread2 extends Thread {
    public void run() {
        int i = 0;

        while (i < 4)
            System.out.println("thread2 is good");
        System.out.println("i am sad");
        i++;

    }
}
public class Extend_Threads1 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
