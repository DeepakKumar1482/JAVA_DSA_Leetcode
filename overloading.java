import java.util.Arrays;

public class overloading {
    public static void main(String args[]){

    int answ=  sum(4,2,7);
      System.out.println(answ);
      demo(3,4,5,6,8,9,7,44,5,6);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a ,int b,int c){
        return a+b+c;
    }
    static String sum(String name){
        return name;
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
