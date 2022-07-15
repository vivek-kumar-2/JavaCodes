import java.util.Scanner;
public class Function_ADD_two_number {
    public static int addTwoNumber(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=addTwoNumber(a,b);
        System.out.println(sum);
    }
}
