package OOPs.java;
//class pen{
//    String color;
//    String type;
//    int prince;
//    public  void write(){
//        System.out.println("use me");
//    }
//    public void print_color(){
//        System.out.println(this.color);
//    }
//}
class Student{
    String name;
    int age;
    int roll_no;
    String Class;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll_no);
        System.out.println(this.Class);
    }
    Student(String name,int age, int roll_no,String Class){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
        this.Class=Class;
    }
    }
public class accessing_objects {
    public static void main(String[] args) {
//        pen pen1=new pen();
//        pen1.color="blue";
//        pen1.type="gel";
//        pen pen2=new pen();
//        pen2.color="red";
//        pen2.type="ball point";
//        pen2.prince=5;
//        pen1.write();
//        pen1.print_color();
//        pen2.print_color();
        Student s1=new Student("Deepak Kumar Chauhan",19,1482,"E");
//        s1.name="Deepak Kumar Chauhan";
//        s1.age=19;
//        s1.roll_no=1482;
//        s1.Class="E";
        s1.info();
    }
}
