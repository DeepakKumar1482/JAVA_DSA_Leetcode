package DP;

public class fabonacci {
    public static void main(String[] args) {
        int num=10;
        System.out.println(fab(10,new int[num+1]));
    }
    public static int fab(int n, int []qb){
        if(n==0 ||n==1){
            return n;
        }
        if (qb[n]!=0){
            return qb[n];
        }
        int fb1=fab(n-1,qb);
        int fb2=fab(n-2,qb);
        int fbn=fb1+fb2;
        qb[n]=fbn;
        return fbn;
    }
}
