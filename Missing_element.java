public class Missing_element {
    public static void main(String11[] args) {
        int []arr={1,2,3,4,6,7};
            int n = 7;
           int Expected_Sum_Of_n_No = (n * ((n + 1) / 2));
           int sum=0;
        for (int i :arr) {
            sum += i;
        }
        System.out.println(Expected_Sum_Of_n_No - sum);
    }
}
