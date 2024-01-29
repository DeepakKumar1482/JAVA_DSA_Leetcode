package Recursion_kunal;

public class sum_n_Numbers {
    public static void main(String[] args) {
        System.out.println(helper(10));
    }
    public static int helper(int num){
        if(num==1){
            return 1;
        }
        return helper(num-1)+num;
    }
}
