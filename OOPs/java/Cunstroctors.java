package OOPs.java;

public class Cunstroctors {
    public static void main (String args[]){
Student1 s1=new Student1("Deepak");
        System.out.println(s1.name);
    }
}
class Student1{
    String name;
    int roll;
    Student1(String name){
this.name=name;
    }
}
