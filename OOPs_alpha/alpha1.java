package OOPs_alpha;

public class alpha1 {
    public static void main(String args[]){
        Pen p1=new Pen();//created a pen object
        p1.setColor("green");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
//        objects are created inside the heap memory
//Encapsulation
//        Abstraction
// Inheritance
//        Polymorphism
    }
}
class Pen {
  private   String color;
    private int tip;
String getColor(){
    return  this.color;
}
int getTip(){
    return this.tip;
}
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
//class BankAccount {
//    public String username;
//    private String password;
//
//    public void setPassword(String pwd) {
//        password = pwd;
//    }
//}


//    class Student {
//        String name;
//        int age;
//        float percentage;
//
//        void clcPercentage(int phy, int chem, int maths) {
//            percentage = (phy + chem + maths) / 3;
//        }
//    }
}