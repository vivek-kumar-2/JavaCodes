public class Recursion7 {
    public static int printPowFun(int x, int n){
        if(n==0){   //Base Case1
            return 1;
        }
        if (x==0){     //Base Case2
            return 0;
        }
        int xPownm1=printPowFun(x,n-1);     //Recursive Work
        int xPown= x * xPownm1;         //x*x^n-1
        return xPown;       //x^n return
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans=printPowFun(x,n);
        System.out.println(ans);
    }
}
