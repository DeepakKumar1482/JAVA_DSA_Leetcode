package CoreJava.java;
//class Hello{
//    int rollnum=10;
//    static int marks=20;
//
//    void print(){
//        System.out.println("Roll Number :- "+rollnum);
//        System.out.println("Marks :- "+marks);
//    }
//}
class StaticCheck{
    {
        System.out.println("Hello world!");
    }
    static{
        System.out.println("This is static block");
//        Here in this example static block will print just once doesn't matter how many object of this class you made
//        Hello world! will print as many number of times as number of objects you create but static block will
//        print just once because the memory will be allocated just once to the static block.
    }
}
public class final_keyword {
//    public static void main(String[] args) {
//        Hello h=new Hello();
//        h.rollnum+=20;
//        h.marks+=30;
//        h.print();
//        Hello m=new Hello();
//        m.marks+=50;
//        m.print();
//        final_keyword a=new final_keyword();
//        a.printer();
//    }
//    public void printer(){
//        System.out.println("Hello world!");
//    }
public static void main(String[] args) throws Exception {
//    StaticCheck s1=new StaticCheck();
//    StaticCheck s2=new StaticCheck();
//    StaticCheck s3=new StaticCheck();
//    If we have to load the class without using any static variable of static method and without creating any object
//    of the class then we use Class.forName("name of the package.name of the class")
    Class.forName("CoreJava.java.StaticCheck");
}
}




