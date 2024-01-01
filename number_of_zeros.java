//Counting numbers of Zeros in the given number using "RECURSION";
public class number_of_zeros {
    public static void main(String args[]){
        int num=302301000;
        num_of_zeros(num,0);

    }
    static void num_of_zeros(int num,int count){
        if(num==0){
            System.out.println("Number of Zeros in Give number is : "+count);
            return;
        }
        int rem=num%10;
        if(rem==0){
            count++;
        }
        num=num/10;
        num_of_zeros(num,count);
    }
}
