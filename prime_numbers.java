import java.util.Scanner;

public class prime_numbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        prime_or_not(num);
    }
    static void prime_or_not(int number){
        for(int i=2;i<=number;i++){
            int count=0;
             {
                for (int j = 2; j <=Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }

                }
            }

            if( count==0){
                System.out.println(i);
            }
        }
    }
}


