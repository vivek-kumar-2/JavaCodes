import java.util.Scanner;

public class apple {
    public static void main(String11[] args) {
        Scanner in=new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int i=0;
        int[] apples = new int[m];
        for( i=0; i < m; i++){
            apples[i] = in.nextInt() + a;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[i] = in.nextInt() + b;
        }
        int count1=0,count2=0;
        for( i=0; i<m ; i++){
            if(a+apples[i] >=s && a+apples[i]<=t){
                count1++;
            }
        }
        for(int oranges_i=0; oranges_i<n ; oranges_i++){
            if(b+orange[i] >=s && b+orange[i]<=t){
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}

