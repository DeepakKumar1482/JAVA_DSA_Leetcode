import java.util.Arrays;

public class string_array {
    public static void main(String args[]){
        String name ="Deepak kumar chauhan";
        char target='r';
        System.out.println(Arrays.toString(name.toCharArray()));
        boolean ans=search_char(name,target);
        System.out.println(ans);
    }
    static boolean search_char(String na,char tar){
        for(char ch : na.toCharArray() )
        {
            if (ch == tar) {
                return true;
            }
            }
        return false;
    }
}
