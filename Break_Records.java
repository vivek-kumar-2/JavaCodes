import java.util.Scanner;
public class Break_Records {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int max_count=0;

            for (int i=1; i<n; i++){
                if(arr[i]>max){
                    max_count++;
                    max = arr[i];
                }
            }
            int min=arr[0];
        int min_count=0;
            for(int i=1; i<n; i++){
                if(arr[i]<min){
                    min_count++;
                    min=arr[i];
                }

            }
        System.out.println(max_count+" "+min_count);
    }
}
