package Recursion_kunal;

public class fabbonacci {
    public static void main(String[] args) {
        System.out.println(fab(6));
    }
    public static int fab(int num){
        if(num<2){
//            System.out.println(num);
            return num;
        }
        int one=fab(num-1);
        int two=fab(num-2);
        return one+two;
    }
}
