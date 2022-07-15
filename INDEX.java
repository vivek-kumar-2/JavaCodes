import java.util.Scanner;
public class INDEX {

    public static void  main(String11[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int a=sc.nextInt();
        int []arr=new int[a];
        for(int i=0; i<a; i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
      for (int i=0; i<a; i++) {
          if (arr[i] == x) {
              System.out.println(i);
              count++;
              break;

          }
      }
        if(count==0){
            System.out.println("this element is not in our array list");
        }

    }

}
