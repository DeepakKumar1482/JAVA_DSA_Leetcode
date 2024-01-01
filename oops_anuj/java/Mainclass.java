package oops_anuj.java;

public class Mainclass {
    public static void main(String[] args) {
       Person p1=new Person();
       p1.name="Deepak";
       p1.age=19;
        System.out.println(p1.name+" "+p1.age);
        Person p2=new Person();
        p2.name="Kumar Chauhan";
        p2.age=18;
        System.out.println(p2.name+" "+p2.age);
        p1.walk(5);
        p2.eat();
    }
}
class Person{
//  (name and age) are the   properties of Person class
    String name;
    int age;
//    below(walk and eat) are the behaviour of Person class
    void walk(){
        System.out.println(name+" "+"is walking");
    }
    void eat(){
        System.out.println(name+" "+"is eating");
    }
    void walk(int steps){
        System.out.println(name+" "+"walked "+steps+" "+"steps");
    }
}
