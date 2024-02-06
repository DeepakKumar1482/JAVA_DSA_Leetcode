public class onlineTution {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    static int factorial (int num){
        if(num<1){
            return 1;
        }
        return factorial(num-1)*num;
    }
}
