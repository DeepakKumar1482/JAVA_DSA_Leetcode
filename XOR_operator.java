import java.sql.Array;
import java.util.*;

public class XOR_operator {
    public static void main(String args[]){
        int nums[]={2,3,3,4,2,6,4,10};
        int unique=0;
        for(int n:nums){
            unique=unique^n;
        }
        System.out.println(unique);
        }
}
