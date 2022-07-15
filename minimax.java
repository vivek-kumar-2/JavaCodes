import java.util.Arrays;
import java.util.Scanner;
public class minimax {
    public static void main(String11[] args) {
        Scanner sc = new Scanner(System.in);
        int max_sum = 0, i, min_sum = 0;
        int[] arr = new int[5];
        for (i = 0; i<5; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(i = 1; i<5; i++){
            max_sum += arr[i];
        }
        for(i = 0; i<4; i++){
            min_sum += arr[i];
        }
        System.out.println(min_sum +" " + max_sum);
    }
}
