package Tutioln;
public class interpreted {
    public static void main(String[] args) {
//        1234 4321
        int num=1234;
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=sum*10+rem;
//            System.out.print(rem);
            num=num/10;
        }
        System.out.println(sum);
    }
}
