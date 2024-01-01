//Given an array nums of integers return how many of them contain an EVEN NUMBER OF DIGITS
public class numberofdigits_even {
    public static void main(String args[]){
        int arr[]={12,337,21,6,78,44,455};
        int ans=even_num(arr);
        System.out.println(ans);

    }
    static int even_num(int ar[]){
        int rem,count=0,count2=0;
        for(int i=0;i<ar.length;i++){
            while(ar[i]>0) {
                rem = ar[i] % 10;
                ar[i] = ar[i] / 10;
                count += 1;
            }
            if(count%2==0){
                count2+=1;
            }
        }
        return count2;
    }
}
