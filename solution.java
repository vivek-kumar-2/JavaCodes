import java.util.Scanner;
public class solution {
    public static void main(String11[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        int []a=new int[n];
        for (int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        for (int i=0; i<n-5; i++){
            sum +=a[i];
        }
        System.out.println(sum);
    }
}