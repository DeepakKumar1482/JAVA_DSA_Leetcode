package OOPs.java;
class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        int c=(l*h)/2;
        System.out.println(c);
    }
}
class EquilateralTriangle extends  Shape{
    public void area(int m,int n){
        System.out.println((m*n)/2);
    }
}
public class inheretence {
    public static void main(String[] args) {
        
    }
}
