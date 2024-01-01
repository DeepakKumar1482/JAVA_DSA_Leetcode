package Tutioln;

public class recursion {
    public static void main(String[] args) {
//        System.out.println( naturalsum(10));
//    }
//    public static int  naturalsum(int num) {
//        if(num==0){
//            return 0;
//        }
//        return num+naturalsum(num-1);
//    }
        for (int i=0;i<10;i++){
            System.out.println(fabonacci(i));
        }
    }
    public static int fabonacci(int n){
        if(n<=1){
            return n;
        }
        else {
            return fabonacci(n-1)+fabonacci(n-2);
        }
    }
}
