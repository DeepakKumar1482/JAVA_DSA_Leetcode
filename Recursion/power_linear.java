package Recursion;

public class power_linear {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }
    public static int power(int n,int p){
        if(p==0){
            return 1;
        }
       int xn1=power(n,p-1);
       int ans=xn1*n;
       return ans;
    }
}
