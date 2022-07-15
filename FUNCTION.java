//import java.util.Scanner;
//public class FUNCTION {
//    public static int AddNumber(int a, int b){
//        int c=0;
//        c=a+b;
//        return c;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=AddNumber(a,b);
//        System.out.println(c);
//
//    }
//
//}
//import java.util.Scanner;
//class MultipleNumber{
//    public static int TWONUMBER(int a, int b){
//        int Multiple=a*b;
//        return Multiple;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//           int a=sc.nextInt();
//           int b=sc.nextInt();
//           int Multiple=TWONUMBER(a,b);
//        System.out.println(Multiple);
//        }
//}
import java.util.Scanner;
class Factorial {
    public static int Factorial(int n) {
        if (n<0){
            System.out.println("Invalid Number");
            return 0;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String11[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Factorial=Factorial(n);
        System.out.println(Factorial);
    }
}