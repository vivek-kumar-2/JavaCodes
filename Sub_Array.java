//N = 5, S = 12
//        A[] = {1,2,3,7,5}
//        Output: 2 4
//        Explanation: The sum of elements
//        from 2nd position to 4th position
//        is 12.
import java.util.Scanner;
public class Sub_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []arr=new int[N];
        for (int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<N; i++){
            for (int j=i+1; j<N; j++){
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                    System.out.print("\t");
                }
                }
            }


        }

    }

