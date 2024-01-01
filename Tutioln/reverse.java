package Tutioln;

public class reverse {
    public static void main(String args[]){
        int num=1234;
        while (num>0){
            int rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
}
