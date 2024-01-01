package DP;

public class count_binary_strings {
    public static void main(String[] args) {
        System.out.println(NonConsecutiveZeros(6));
    }
    public static int NonConsecutiveZeros(int length){
        int []dp0=new int[length+1];
        int []dp1=new int[length+1];
        dp0[1]=1;
        dp1[1]=1;
        for (int i=2;i<=length;i++){
            dp0[i]=dp1[i-1];
            dp1[i]=dp1[i-1]+dp0[i-1];
        }
        return dp1[length]+dp0[length];
    }
}
