import java.util.Scanner;
public class Specific_Sum {
    public static void main(String11[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               int x = sc.nextInt();
                if (arr[i] + arr[j] == x) ;
                System.out.println(x+" ");
            }

        }

    }
}
