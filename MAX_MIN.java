import java.util.*;
public class MAX_MIN {
    public static void main(String11[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = i+1; j < a; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

            }
       System.out.println(arr[0]+ " "+arr[a-1]);
        }
    }
