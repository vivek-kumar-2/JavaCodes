import java.util.Scanner;
public class plus_minus {
    public static void main(String11[] args) {
        Scanner sc=new Scanner(System.in);
        float count=0,temp=0,flag=0;

        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0; i<n; i++) {            //   6
                                                // -4 3 -9 0 4 1
            arr[i]=sc.nextInt();
        }
       for (int i=0; i<n; i++) {
           if (arr[i] > 0) {
               count++;
           }
           if (arr[i] < 0) {
               temp++;

           }
           if (arr[i] == 0) {
               flag++;
           }
       }
        System.out.println(count/n);
        System.out.println(temp/n);
        System.out.println(flag/n);
    }
}