import java.util.Scanner;
public class squareMatrix {
    public static void main(String11[] args) {
        Scanner sc=new Scanner(System.in);
        int row=3;
        int column=3,sum;
        int [][]arr=new int[row][column];
        for (int i=0; i<row; i++){
            {
                for(int j=0; j<column; j++){
                    arr[i][j]=sc.nextInt();

                }
                 sum=(arr[0][0]+arr[1][1]+arr[2][3])-(arr[2][0]+arr[1][1]+arr[0][3]);
            }
            System.out.println(sum);
        }

    }
}
