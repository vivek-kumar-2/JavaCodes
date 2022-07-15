import java.util.Scanner;
public class Copy_Element {
    public static void main(String11[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] new_arr = new int[5];
        for (int i = 0; i < 5; i++) {
            new_arr[i] = arr[i];
            int t=sc.nextInt();
            if(new_arr[i]==t){

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(new_arr[i]+" ");
        }
    }
}
