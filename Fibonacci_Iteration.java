public class Fibonacci_Iteration {
    public static void main(String[] args) {
        int n=5, a=0,b=1,c;
        System.out.println(a+" "+b);
        for (int i=0; i<n; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
