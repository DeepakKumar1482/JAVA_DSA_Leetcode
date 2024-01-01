public class leetcode2180 {
    public static void main(String[] args) {
        int num=896;
        System.out.println(countEven(num));
    }
    public static int countEven(int num) {
        int count=0;
        int sum=0;
        int k=0;
        int temp=num;
        while (temp>0){
            sum=sum+temp%10;
            temp=temp/10;
        }
        if(sum%2==0) {
            for (int i = 2; i <= num; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        if(sum%2!=0) {
            for (int i = 2; i <num; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
