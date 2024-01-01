package OOPs.java;

public class static_use {
    public static void main(String args[]){

    }
    static void fun(){
       static_use obj=new static_use();
       obj.greeting();
    }
    void greeting(){
        System.out.println("hello world");
    }
}

