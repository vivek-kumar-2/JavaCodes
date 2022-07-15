import java.util.Arrays;
import java.util.Scanner;

public class Diff_Max_Min {
    public static void main(String11[]args){
        Scanner in =new Scanner(System.in);
    int n,max=0,min=0,sum=0;
    n=in.nextInt();
    int []arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i] =in.nextInt();
        }
        for (int i=0; i<n; i++) {
            Arrays.sort(arr);
            sum+=arr[i];
            if (arr[i] == min)
             min =arr[i];
             else if(arr[i]==max){
                 max=arr[i];
              }
            }

     //   System.out.println(arr[n-1]-arr[0]);
        float avg=0;
        avg=(sum-max-min)/(n-2);
        System.out.print(avg);
    }
}
