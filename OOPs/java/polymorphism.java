package OOPs.java;
class Students{
    String name;
    int age;
    public void info(String name){
        System.out.println(name);
    }
    public void  info(int age){
        System.out.println(age);
    }
    public void info(String name, int age){
        System.out.println(name+" "+age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Deepak";
        s1.age=19;
        s1.info(s1.name,s1.age);
    }
}
