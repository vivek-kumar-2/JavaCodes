import java.util.Scanner;
import java.lang.Math;
public class Diagonal_Diffrence{
    public static void main(String11[] args){
        int sum1 = 0,sum2=0;
        int n ;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (i == j)
                    sum1 = sum1 + arr[i][j];
                if (i+j==n-1)
                    sum2 = sum2 + arr[i][j];
            }
        }
        System.out.print(Math.abs(sum2 - sum1));
    }
}
