import java.util.*;
public class Three_Sorted_Array_Common_Element {
    public static void main(String11[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int[] arr2 = {9, 2, 3, 7, 5, 6};
//        int[] arr3 = {0, 0, 5, 0, 2, 0};
        int arr[] = {2, 4, 8};
        int arr2[] = {2, 3, 4, 8, 10, 16};
        int arr3[] = {4, 8, 14, 40};
//        for (int i : arr) {
//            for (int j : arr2) {
//                for (int k : arr3) {
//                    if (arr[i] == arr2[j] && arr2[j] == arr3[k] && arr3[k] == arr[i]) {
//                        i++;
//                        j++;
//                        k++;
//                       ArrayList list = new ArrayList<Integer>(6);
//                        list.add(arr[i]);
//                        list.add(arr[j]);
//                        list.add(arr[k]);
//                    }
//                }
//
//            }
//
//        }
        ArrayList list = new ArrayList<Integer>(6);
        for(int i = 0; i < arr.length; i++){
            int test_elem = arr[i];
            for(int j = 0; j < arr2.length; j++){
                if(test_elem == arr2[j]){
                    for(int k = 0; k < arr3.length; k++){
                        if(test_elem == arr3[k]){
                            list.add(test_elem);
                        }
                    }
                }
            }
        }
        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
