class MyThre extends Thread {
    public MyThre(String name) {   //constructor of thread class
        super(name);
    }

    public void run() {

        //     System.out.println("i am a thread");
        int i = 34;
        while (true) {
            System.out.println("thank you" + this.getName());

       }

        }
    }

    public class Thread_Priorities {
        public static void main(String[] args) {
            //ready queue thread1 t2 t3 t4 t5
            MyThre t1 = new MyThre("Vivek1");
            MyThre t2 = new MyThre("Vivek2");
            MyThre t3 = new MyThre("Vivek3");
            MyThre t4 = new MyThre("Vivek4");
            MyThre t5 = new MyThre("Vivek5(most Importtant)");
            t5.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

        }
    }

