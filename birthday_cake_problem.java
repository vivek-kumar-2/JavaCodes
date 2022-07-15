import java.util.Scanner;
public class birthday_cake_problem {
    public static void main(String11[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0,max;
        n= sc.nextInt();
        int [] arr=new int[n];
        for( i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        max=arr[0];
        for( i=0; i<n-1; i++)
            if(arr[i]>max){
                max=arr[i];
        }
        for (i=0; i<n; i++){
            if(arr[i]==max){
                count++;
            }
        }
        System.out.println(count);
    }
}
