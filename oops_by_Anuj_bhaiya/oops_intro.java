package oops_by_Anuj_bhaiya;

import encapsulation.Encapsulationintor;

public class oops_intro {
    public static void main(String str[]) {
//        p1 and p2 are the objects of class person.
//        without making the objects you can not access features of that object
        person p1 = new person();
        person p2=new person();
        p1.name = "Deepak kumar Chauhan";
        p2.name="Rahul";
        System.out.println(p1.name);
        p1.walk();
        p2.eat();
        p1.walk(24);
        Developer d1=new Developer(18,"Akash");
        Encapsulationintor obj1=new Encapsulationintor();
        obj1.doWork();
    }
}
class Developer extends person{
    public Developer(int age, String name){
        super(age,name);
    }
}
    class person{
    String name;
    int age;

//        public person(int age, String name) {
//        }

        //    Behavior of the class object
         public person(int age,String name){
            this.name=name;
            this.age=age;
        }

        public person() {

        }

        void walk(){
            System.out.println(name+" "+"is walking");
        }
        void eat(){
            System.out.println(name+" "+"is eating");
        }
        void walk(int steps){
            System.out.println(name+" walked "+steps+" steps");
        }
}
