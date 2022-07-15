public class Two_Part_Sort {
    public static void main(String[] args) {
        int []arr={3,2,6,4,5,1,0};
        int start=0,end=3,start1=4,end1=6;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    if (arr[i] > arr[j]) {
                        temp=arr[start1];
                        arr[start1]=arr[end1];
                        arr[end1]=temp;
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }
    }
}
