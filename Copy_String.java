public class Copy_String {
    public static void main(String[]args){
        char[]str1=new char[]{'1', '2', '3', '4', '5'};
        String str2=String.copyValueOf(str1,1,3);
        System.out.println("The Book Contain "+" " + str2 + " Pages");
    }
}
