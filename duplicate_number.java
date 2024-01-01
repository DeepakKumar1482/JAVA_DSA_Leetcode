import java.util.Arrays;

public class duplicate_number {
    public static void main(String args[]){
        int array[]={2,4,2,3,1};
        int ans=duplicate(array);
        System.out.println(ans);
    }
    static int duplicate(int arr[]){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]-1]){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return arr[j];
            }
        }
        return 0;
    }
}
