package CoreJava.java;
// This is for Inheritance
//If you use final before the class then no one can inherit that class
//final
    class A{
    int a=10;
    static int b=20;
    {
        System.out.println("Instance block in A");
    }
    static{
        System.out.println("Static block in A");
    }
    A(){
        System.out.println("Default constructor in A");
    }
    void m1(){
        System.out.println("M1 in A");
    }
    static void m2(){
        System.out.println("M2 in A");
    }
//This is a super class or parent class
}
class B extends A{
//This is a subClass or child class
//    all the variables , methods inherits by the subclass but the block and the constructor does not inherited by the
//    subclass.
{
    System.out.println(a);
    System.out.println(b);
}
}
class C extends B{
//    A class can not inherit more than one class at a time in java
}
public class Inharitance_exm {
    public static void main(String[] args) {
        B b1=new B();
        b1.m1();
        B.m2();
        String s="abc";
        boolean ans=s.contains(Character.toString(s.charAt(0)));
        System.out.println(ans);
    }
}




