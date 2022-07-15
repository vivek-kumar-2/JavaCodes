public class Recursion5 {
    public static int printFactorial(int n) {
        if (n == 0  || n==1) {
            return 1;
        }
        int RecFunFact=printFactorial(n-1);
        int factorial_of_n=n*RecFunFact;
        return factorial_of_n;
    }

    public static void main(String[] args) {
        int n=5;
        printFactorial(5);
        System.out.println(printFactorial(5));

    }
}


