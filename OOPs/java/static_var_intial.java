package OOPs.java;

public class static_var_intial {
    static int a=5;
    static int b;
    static {
        System.out.println("hyy i am inside the static block");
        b=a*2;
    }

    public static void main(String[] args) {
        static_var_intial obj=new static_var_intial();
        System.out.println(static_var_intial.a+" "+static_var_intial.b);
    }
}
