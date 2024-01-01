import java.util.Arrays;
import java.util.Scanner;

public class find_missing_numbers {
    public static void main(String args[]) {
        int arr[] = {4,3,2,7,8,2,3,1};
        int i=0;
        while(i<arr.length) {
            if(arr[i]!=arr[arr[i]-1]){
                  int temp=arr[arr[i]-1];
                  arr[arr[i]-1]=arr[i];
                  arr[i]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        missing_numbers(arr);
        }
        static void missing_numbers(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.print(i+1+" ");
            }
        }
        }
}

