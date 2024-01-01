public class equlibrium {
    public static void main(String args[]) {
        long []array = {4 ,42 ,27, 16, 28, 3, 4, 5, 9, 3, 31, 5, 5, 29, 10, 18, 35, 35, 33, 19, 41, 23, 8, 32 ,9, 5, 8, 18,
                35, 13, 6, 7, 6, 10, 11, 13, 37, 2, 25, 7, 28 ,43};
        int num=42;
        long ans=equilibriumPoint(array,num);
        System.out.println(ans);
    }
    public static int equilibriumPoint(long arr[], int n) {

        long sum=0;
        int i=0;
        while(i<n){
            sum=sum+arr[i];
            i++;
        }
        System.out.println(sum);
        int j=1;
        long sum1=0;
        while(j<=n){
            sum1=sum1+j;
            j++;
        }
        System.out.println(sum1);
        return (int)((sum1-sum)+1);

    }

}
