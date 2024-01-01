package Recursion;

public class fabonacci {
    public static void main(String[] args) {
        int ans=fab(6);
//        System.out.println(ans);
    }
    public static int fab(int num){
        if(num<2){
            return 0;
        }
        int n1=fab(num-1);
        int n2=fab(num-2);
        return  n1+n2;
    }
}
