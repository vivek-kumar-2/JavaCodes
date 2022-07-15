//Time  Complexity =O(n*n!)
public class BACKTRACKING {
    public static void printPermutation(String str,String emptyperm,int index){ //print function
            if(str.length()==0){
                System.out.println(emptyperm);
                return;
            }
        for (int i=0; i<str.length(); i++){
           char currChar=str.charAt(i);   //find current characater in first postion
           String newStr=str.substring(0,i) +str.substring(i+1);  //current char remove
            //emptyperm=emptyperm+currChar;
           printPermutation(newStr, emptyperm +currChar,index+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printPermutation(str,"",0);

    }
}
