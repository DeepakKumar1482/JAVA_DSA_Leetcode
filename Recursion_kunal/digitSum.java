package Recursion_kunal;

public class digitSum {
    public static void main(String[] args) {
        System.out.println(DigitSum(123));
    }
    public static int DigitSum(int num){
        if(num==0){
            return 0;
        }

        return DigitSum(num/10)+num%10;
    }
}
