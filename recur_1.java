public class recur_1 {
    public static void main(String args[]){
        int n=10;
        print(n,1);
    }
    static void print(int num,int i){
        if(i==num){
            System.out.println(num);
            return ;
        }
        else{
            System.out.println(i);
            print(num,i+1);
        }
    }
}
