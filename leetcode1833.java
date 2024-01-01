import java.util.Arrays;

public class leetcode1833 {
    public static void main(String[] args) {
        int costs[]={7,3,3,6,6,6,10,5,9,2};
        int coins=56;
//        [2, 3, 3, 5, 6, 6, 6, 7, 9, 10]
        Arrays.sort(costs);
        System.out.println(Arrays.toString(costs));
        int sum1=costs[0];
        int sum=0;
        int i=0;
        while(sum<coins && i<costs.length){
            sum=sum+costs[i];
            i++;
            if(sum>coins){
                i--;
            }
            System.out.print(sum+" ");
        }
       System.out.println(i);
    }
}
