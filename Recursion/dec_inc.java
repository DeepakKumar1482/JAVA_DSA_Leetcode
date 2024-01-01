package Recursion;

public class dec_inc {
    public static void main(String[] args) {
        int num=10;
        DecInc(num);
    }
    public static void DecInc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        DecInc(n-1);
        System.out.println(n);
    }
}
