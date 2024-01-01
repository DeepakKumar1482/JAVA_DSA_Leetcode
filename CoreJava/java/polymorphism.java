package CoreJava.java;
//This file is having Pollymorphism concepts
//1. There are two static {Compile time polymorphism} and dynamic polymorphism {run time polymorphism}
//2. static polymorphism is achieved by method overloading
//3. dynamic polymorphism is achieved by dynamic dispatch and method overriding
//Compile time - On compile time compiler just see the syntax error or something which is not possible in that language
// run time error - on run time error it see all the other things
class A1{
    void m1(){
        System.out.println("In m1 A Void");
    }
    int m1(int a){
        System.out.println("In m1 Int");
        return a;
    }
    public void m1(double a){
        System.out.println("In m1 Double");
    }
}
class B1 extends A1{
    void m1(){
        System.out.println("Inside B1 Void");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        A1 a=new A1();
        a.m1();
        a.m1(5);
        a.m1(4.5);
//        Dynamic dispatch is below
//        A1 is a super class here while B1 is the subclass here
        A1 a1=new B1();
        a1.m1();
//        This is basically method overriding or run time polymorphism
//
    }
}
