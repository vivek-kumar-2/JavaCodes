public class Recursion4 {
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        int n=10;
        printSum(1,5,0);
    }
}
