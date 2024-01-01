//Class is basically the process to make your own data type
// which can hold the values of more than one data type
//First letter of class is always Capital
package OOPs.java;

import java.util.Arrays;

public class class_making {
    public static void main(String[] args) {
        int roll_no[]=new int[5];
        String name[]=new String[5];
        double marks[]=new double[5];
        Student[]students=new Student[5];
        Student Deepak=new Student(45,"Deepak chauhan",92.3f);
//        Deepak.name_change("Deepak Kumar Chauhan");
//        Deepak.greeting();
//        Deepak.roll_no=14;
//        Deepak.name="Deepak Kumar Chauhan";
//        Deepak.marks=89.3;
        System.out.println(Deepak.roll_no);
        System.out.println(Deepak.name);
        System.out.println(Deepak.marks);
        Student one= new Student();
        Student two =one;
        one.name="something something";
        System.out.println(two.name);
    }
    static class Student{
        int roll_no;
        String name;
        double marks;
        void greeting(){
            System.out.println("Hello! My Name Is "+this.name);
        }
        void name_change(String new_name){
            name=new_name;
        }
        Student() {
            this.roll_no = 5;
            this.name = "Deepak";
            this.marks = 87.4;
        }
        Student(int roll_no,String name,float marks){
            this.roll_no=roll_no;
            this.name=  name;
            this.marks=marks;
        }
    }
}
