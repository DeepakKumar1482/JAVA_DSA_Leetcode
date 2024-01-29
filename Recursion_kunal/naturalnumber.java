package Recursion_kunal;

public class naturalnumber {
    public static void main(String[] args) {
        helper(5);
    }
    public static void helper(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        helper(num-1);;
        int i=1;
        System.out.println(i);
        i++;
    }
}
