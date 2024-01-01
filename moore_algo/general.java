package moore_algo;
//Find the element which has most frequency in the given array
public class general {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 65, 4, 75, 3, 4, 3, 54, 4,6, 5, 43, 5};
        int max=0;
        int number=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length;i++){
            int c=1;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=Integer.MIN_VALUE){
                    c++;
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            if(c>max){
                number=arr[i];
                max=c;
            }
        }
        System.out.print("The maximum frequency number present in the array is "+number+" and frequency is = "+max);
    }
}