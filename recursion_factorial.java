public class recursion_factorial {
    public static void main(String args[]){
        int num=5;
        fact(num,1);
    }
    static void fact(int n,int fact){
        if(n==1){
            fact=fact*n;
            System.out.println(fact);
            return ;
        }
        else{
            fact=fact*n;
            System.out.println(fact);
            fact(n-1,fact);
        }
    }
}
