import java.util.Arrays;

public class insertion_sort {
    public static void main(String args[]){
        int array[]={12,32,9,14,6,4,0,32,45,7,18};
        Insertion_ascending(array);
        System.out.println(Arrays.toString(array));
    }
    static void Insertion_ascending(int arr[]){
        for(int i=0;i<arr.length-1;i++){//0 1 2
            for(int j=i+1;j>0;j--){//6 3 4 2 5  //3 6 4 2 5 // 3 4 2 6 5
                if(arr[j]<arr[j-1]){              //3 4 6 2 5//
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            else break;
            }
        }
    }
}
