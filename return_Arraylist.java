import java.util.ArrayList;

public class return_Arraylist {
    public static void main(String[] args) {
        int arr[]={3,1,6,3,3,10,3};
        ArrayList<Integer>list=new ArrayList<>();
        find_indexes(arr,3,0,list);
        System.out.println(list);
    }
    static ArrayList<Integer> find_indexes(int arr[],int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        find_indexes(arr,target,index+1,list);
        return list;
    }
}
