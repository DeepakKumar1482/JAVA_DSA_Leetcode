//Linear search question to check the index of any number present in the array
import java.util.Scanner;

public class find_number {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int ans= find_index (arr);
        System.out.println(ans);
    }
  public  static int find_index(int ar[]){
        System.out.println("Enter the number which is to found");
        Scanner in=new Scanner(System.in);
        int find=in.nextInt();
        int count=0;
        int len=ar.length;
        for(int j=0;j<len;j++){
            if(ar[j]==find) {
                return j;

            }
        }
       return -1;

    }
}

