public class leetcode1543 {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,11};
        int k = 5;
        findKthPositive(arr,k);
    }
    public static void findKthPositive(int[] arr, int k){
        int count=0;
        int num=1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=num){
//                count++;
//                System.out.println(num);
//                num++;
//                i--;
//            }
        int i=0;
        while(i<arr.length){
            if(arr[i]!=num){
                count++;
//                System.out.println(num);
            }
            else{
                i++;
            }
            if(count==k){
                System.out.println(num);
//                return num;
            }
            num++;
//            System.out.println(num);
        }

    }
}

