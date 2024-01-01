public class recursion_reverse {
    public static void main(String args[]){
        int n=123;
        rev(n);
    }
    static void rev(int n){
        if(n==0){
            return;
        }
        else{
            int rem=n%10;
            System.out.print(rem);
            n=n/10;
            rev(n);
        }
    }
}
