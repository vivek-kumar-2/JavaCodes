import java.util.Scanner;
public class testt {
    public static void main(String11[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3, temp=0,count=0;
        int[] arr1 = new int[3];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();

        }
        int[] arr2 = new int[3];
        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }
                if (arr1[0] > arr2[0]) {
                    temp++;
                }
                else if(arr1[2]< arr2[2]) {
                    count++;
                }
             System.out.print(temp+" "+count);
            }

        }





