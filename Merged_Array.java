public class Merged_Array {
    public static void Divide(int []arr,int si, int ei){
        if(si>=ei){
            return;
            //O(log n) Divide
        }
        int mid=si+(ei-si)/2;   //(si+ei)/2;  Space Complexity Problem
        Divide(arr ,si, mid);
        Divide(arr,mid+1, ei);
        Conquer(arr,si,mid,ei);
    }
    //Time Complexity=n(log n) Conquer
    public static void Conquer(int []arr,int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;
        //O(n) Conquer
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            }
            else {
                merged[x++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }
        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }
        for(int i=0,j=si;i< merged.length; i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void main(String[] args) {
        int []arr={6,3,9,5,2,8};
        int n= arr.length;
        Divide(arr, 0, n-1);
        //print
        for (int j=0; j<n; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println("\t");
    }
}
