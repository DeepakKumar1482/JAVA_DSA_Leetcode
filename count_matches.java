import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class count_matches {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
    public static int numberOfMatches(int n) {
        int matches=0;
        List<Integer>l=new ArrayList<>();
        int team=0;
        while(n>1){
            if(n%2==0){
                matches+=n/2;
                team=n/2;
                n=team;
            }
            else{
                matches+=(n-1)/2;
                team=(n-1)/2+1;
                n=team;
            }
        }
        return matches;
    }
}
