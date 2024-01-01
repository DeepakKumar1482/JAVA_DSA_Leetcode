import java.util.Scanner;
public class switchuse {
    public static void main(String arg[]){
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch(num)
        {
            case 1:System.out.println("Pranam");break;
            case 2:System.out.println(("Namsate"));break;
            case 3:System.out.println("Sastriakal");break;
            case 4:System.out.println("Hello");break;
        }
    }
}
