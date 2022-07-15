import java.util.Scanner;
public class Function_Multiply {
    public static int multiplyTwoNumber(int a,int b){
       int multiply=a*b;
       return multiply;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int multiply1=multiplyTwoNumber(a,b);
        System.out.println("Multiply of Two Numbers"+" "+multiply1);
    }
}
