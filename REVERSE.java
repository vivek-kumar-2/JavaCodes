
public class REVERSE {
    public static void main(String11[] args) {
       int n=5;
        int []arr={1, 2, 3, 4, 5};//    //    for (int i=0; i<n/2; i++){
//            int temp=arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }
        for (int i=0; i<n-1-i;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;

        }
        for (int i=0; i<n; i++)
        System.out.print(arr[i]+" ");
    }
}
