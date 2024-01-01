import java.util.Arrays;
public class missing_number {
    public static void main(String args[]){
        int arr[]={5,3,4,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else break;
            }
        }
        System.out.println(Arrays.toString(arr));
        int ans=find_num(arr);
        System.out.println(ans);
    }
    static int find_num(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1){
               continue;
            }
            else return i+1;
        }
        return arr.length+1;
    }
}
