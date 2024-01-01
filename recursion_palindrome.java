public class recursion_palindrome {
    public static void main(String args[]){
        int n=947;
        int digits= (int) Math.log10(n)+1;
        amstrong(n,digits,0,n);
    }
    static void  amstrong(int n,int dig,int sum,int temp ) {
        if (n==0) {
            if(temp==sum) {
                System.out.println("Number is amstrong number");
                return;
            }
            else{
                System.out.println("Number is not an amstrong number");
                return;
            }
        }

        int rem = n % 10;
        sum = (int) (sum + Math.pow(rem, dig));
        n = n / 10;
        amstrong(n, dig, sum, temp);

    }
}
