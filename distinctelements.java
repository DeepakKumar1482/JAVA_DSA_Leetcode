import java.util.HashMap;
//count the number of distinct elements present in a given length sub array
public class distinctelements {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,1,1,3};
        int k=4;
    }
    public void different_elements(int arr[],int l){
        int start=0;
        int end=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int k=0;
        for (end=0;end<arr.length;end++){
            if(end>=k-1) {
                if (map.containsKey(arr[end])) {
                    continue;
                } else {
                    map.put(arr[end], 1);
                    System.out.println(arr[end]);
                }
                
            }
        }
    }
}
