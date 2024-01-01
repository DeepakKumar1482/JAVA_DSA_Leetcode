import java.util.Scanner;
public class string_input {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
             String name;
             name=in.nextLine();
        System.out.println(name);
        // for length of String use length() in "int" we do not use () in the end of length function but in case of
        //string it's necessary to use  () in end;
        //for finding the length of string
        System.out.println(name.length());
    }
}
