import java.util.Scanner;
public class jump {
        public static void main(String11[] args) {
            Scanner in = new Scanner(System.in);
            int x1 = in.nextInt();
            int v1 = in.nextInt();
            int x2 = in.nextInt();
            int v2 = in.nextInt();
            int vdiff=v1-v2;
            if(vdiff<=0){
                System.out.println("NO");
                return;
            }
            int xdiff=x1-x2;
            System.out.println(xdiff % vdiff==0 ? "YES" : "NO" );
        }
    }

