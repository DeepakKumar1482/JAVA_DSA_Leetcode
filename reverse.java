public class reverse {
    public static void main(String args[]) {
        int[] arr = {12, 34, 1, 56, 34, 98, 12, 67};
        revr(arr);
    }
    public static void revr(int ar[]) {
        int len = ar.length;
        int i = 0;
        int j = len-1;
        while(i <= j){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
        for(int k = 0; k<len; k++){
            System.out.print(ar[k]+" ");
        }


    }
}

