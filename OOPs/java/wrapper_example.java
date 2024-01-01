package OOPs.java;

public class wrapper_example {
    public static void main(String args[]){
        Integer a=10;
        Integer b=34;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(Integer a,Integer b){
        int temp=a;
        a=b;
        b=temp;
    }
}
