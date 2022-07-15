import java.util.Scanner;
public class Hour_Code4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count =0;
        String str1="";
        str1=sc.nextLine();
        StringBuilder str2= new StringBuilder(str1);
        str2=str2.reverse();
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)==str2.charAt(i)){
                count ++;
            }

        }
        System.out.println(count);
    }

}
