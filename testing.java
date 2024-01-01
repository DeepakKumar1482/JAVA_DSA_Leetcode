import java.util.*;

public class testing {
    public static void main(String[] args) {
        String []list1={"happy","sad","good"};
        String []list2={"sad","happy","good"};
//       String []ans= findRestaurant(list1,list2);
//        System.out.println(Arrays.toString(ans));
        findRestaurant(list1,list2);
    }
    public static void findRestaurant(String[] list1, String[] list2){
        PriorityQueue<Helper>q=new PriorityQueue<>();
        for ( int i=0;i<list1.length;i++){
            for ( int j=0;j<list2.length;j++){
                if(list1[i]==list2[j]){
//                    q.add(list1[i],i+j);
                }
            }
        }
    }
    static class Helper{
        String dish;
        int num;
        public Helper(String dish,int num){
            this.dish=dish;
            this.num=num;
        }
    }
}
