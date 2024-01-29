package Recursion_kunal;

public class reverse_number {
    public static void main(String[] args) {
        System.out.println(reverse(123,0));
    }
    public static int reverse(int num,int rem){
        if(num==0){
            return rem;
        }
        rem=rem*10+num%10;
        return reverse(num/10,rem);
    }
}
