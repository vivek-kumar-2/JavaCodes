public class ReCursion_01_07_2022 {
    public static void printNumb(int n){
        if(n==0) {
            return;
        }
            System.out.println(n);
            printNumb(n-1);     //Expect Rest Work Done(RECURSION)
    }
    public static void main(String[] args) {
        int n=5;
        printNumb(n);
    }
}
