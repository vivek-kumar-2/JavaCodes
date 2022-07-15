//   1.GET BIT

public class Bit_Operation {
    public static void main(String11[] args) {
//        int a= 5;
//        int pos=2;
//        int bitMas=1<<pos;
//        if(((bitMask & a) == 0)){
//            System.out.println("bit is 0");
//        }
//        else{
//            System.out.println("bit is 1");
//        }
        //2.SET BIT
//        int a=5;    //0101
//        int pos=1;
//        int bitMask=1<<pos;
//        int newNumber=bitMask | a;
//        System.out.println(newNumber);
        //3.CLEAR BIT
//        int a=5;
//        int pos=2;
//        int bitMask=1<<pos;
//        int notBitMask=~(bitMask);
//        int newNumber= notBitMask & a ;
//        System.out.println(newNumber);
        int a=5;       int pos=1;
        int bitMask=1<<pos;
        int notBitMask=~(bitMask);
        int newNumber= notBitMask & a ;
        System.out.println(newNumber);
        newNumber=bitMask | a;
        System.out.println(newNumber) ;
}
}
