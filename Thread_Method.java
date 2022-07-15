class MYThread extends Thread{
    public void run(){
        System.out.println("thank you");
    }
}
class MYThread2 extends Thread{
    public void run(){
        System.out.println("thank you1");
    }
}
public class Thread_Method {
    public static void main(String[] args) {
        MYThread t1=new MYThread();
        MYThread t2=new MYThread();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
