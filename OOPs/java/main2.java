package OOPs.java;

public class main2 {
    public static void main(String[] args) {
        inheritance box= new inheritance(2);
//        here inheritance(values) it will evaluate the value and use constructor according to the number of
//        arguments are in inheritance() if it is empty then it basically call the constructor with no argument
        System.out.println(box.height);
        System.out.println(box.length);
        System.out.println(box.width);
    }
}
