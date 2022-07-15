class MyThread extends Thread{
    public MyThread(String name){   //constructor of thread class
        super(name);
    }
    public void run(){

       //     System.out.println("i am a thread");
            int i=34;
            System.out.println("thank you");
//        while(true){
//        }

    }
}
public class Thread_class_from_constructor {
    public static void main(String[] args) {
        MyThread t1=new MyThread("Vivek");
        t1.start();
        System.out.println("the id of thread t1 is" + t1.getId());
        System.out.println("the id of thread t1 is" + t1.getName());
    }
}
