package Tutioln;
import java.util.Map;
import java.util.Scanner;

//1+2+3+4=10;
//6=

public class primerange {
    public static void main(String[] args) {
//        "abbcd"
        System.out.println("ENTER ANY NUMBER ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int con = 1;

        // int a = 2.4;
        int str = 2;
        while (con <= num) {
            int pro = 0;
            for (int i = 2; i <= (int) Math.sqrt(str); i++) {
                if (str % i == 0) {
                    pro++;
                    break;
                }

            }
            if (pro == 0) {
                    System.out.println(str + " prime");
                    con++;
            }
            str++;
        }
    }
}
