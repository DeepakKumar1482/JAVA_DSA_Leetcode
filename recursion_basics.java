public class recursion_basics {
    public static void main(String args[]){
        print(1);
    }
    static void print(int a){
        if(a==5){
            System.out.println(a);
            return;
        }
            System.out.println(a);
            a=a+1;
            print(a);
    }
}
