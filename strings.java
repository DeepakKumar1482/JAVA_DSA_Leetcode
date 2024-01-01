import java.util.Scanner;

public class strings {
    public static void main(String args[]){
        String First_name="Deepak";
        String Second_name="Kumar";
        String Full_name=First_name+" "+Second_name;
        System.out.println(First_name+" "+Second_name);
        for(int i=0;i<Full_name.length();i++){
            System.out.print(Full_name.charAt(i));
        }
    }
}
