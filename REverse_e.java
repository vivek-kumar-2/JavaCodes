public class REverse_e {
    public static void main(String[] args) {
        int []arr={3,2,5,2,1};
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length-1-i; j++){
                int temp=0;
                if (arr[i]<arr[j]){
                   temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
