import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int []ar=new int[6];
        int ind=2;
        for (int i=0;i<ind;i++){
            ar[i]=arr[i];
        }
        int j=ind;
        for (int i=ind+1;i<ar.length;i++){
            ar[i]=arr[j];
            j++;
        }
        ar[ind]=12;
        System.out.println(Arrays.toString(ar));
    }
}
