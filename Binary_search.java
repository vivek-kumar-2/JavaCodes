import java.util.Scanner;
public class Binary_search {
    public static void main(String11[] args) {
        int N, K, mid, beg, end, flag = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        K = sc.nextInt();
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr[m] == K) {
                    System.out.println(m);
                    flag = 1;
                    break;
                }

                // If x greater, ignore left half
                if (arr[m] < K)
                    l = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            // if we reach here, then element was
            // not present
        if(flag == 0)
        System.out.println(-1);

    }
}



