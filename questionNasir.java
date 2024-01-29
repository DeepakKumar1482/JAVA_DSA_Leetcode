import java.util.ArrayList;
import java.util.*;

public class questionNasir {
    public static void main(String[] args) {
        int []spells={5,1,3};
        int []potions={1,2,3,4,5};
        System.out.println(Arrays.toString(successfulPairs(spells,potions,7)));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        Arrays.sort(potions);
        // Arrays.sort(spells);
        for (int i = 0; i < spells.length; i++) {
            int count = 0;
            int start=0;
            int end=potions.length;
            while(start<end){
                int mid=start+(end-start)/2;
                long pair=(long)spells[i]*potions[mid];
                if(pair>success){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            count=potions.length-start;
            pairs[i]=count;
        }

        return pairs;
    }
}
