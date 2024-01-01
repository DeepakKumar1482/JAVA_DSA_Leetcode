//finding the index of target which may comes more than once
//so return the index in Array list using "RECURSION"
import java.util.ArrayList;
public class find_all_indexes {
    public static void main(String args[]){
        int arr[]={2,6,2,4,2};
        Find_indexes(arr,2,0);
        System.out.println(list);
    }
    static ArrayList<Integer>list=new ArrayList<>();
            static void Find_indexes(int arr[],int target,int index){
                if(index==arr.length){
                    return;
                }
            if(arr[index]==target){
                list.add(target);
            }
            Find_indexes(arr,target,index+1);
            }
}
