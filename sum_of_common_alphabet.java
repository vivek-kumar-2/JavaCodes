public class sum_of_common_alphabet {
    public static void main(String11[] args) {
        char[] input1 = {'a', 'b', 'c'};
        char[] input2 = {'b', 'c'};
//        char[] input1 = {'g', 'q', 'r'};
//        char[] input2 = {'r', 't', 'u'};
        int i, j;
        int sum = 0;
        for(i = 0; i<input1.length; i++){
            int test_elem = input1[i];
            for (j = 0; j < input2.length; j++){
                if(test_elem == input2[j]){
                    int ascii_value = (int)(test_elem);
                    sum += ascii_value;
                }
            }
        }
        while (sum > 10) {
            int rem, temp_sum = 0;
            while (sum > 0){
                rem = sum % 10;
                temp_sum += rem;
                sum /= 10;
            }
            sum = temp_sum;
        }
        System.out.println(sum);
    }
}
