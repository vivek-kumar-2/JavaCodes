public class Recursion3 {
    public static void prinNatural(int n){
        if(n==11){
            return;
        }
        System.out.println(n);
        prinNatural(n+1);
    }

    public static void main(String[] args) {
        int n=1;
        prinNatural(n);

    }
}
