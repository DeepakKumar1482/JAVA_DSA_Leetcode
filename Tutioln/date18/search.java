package Tutioln.date18;

public class search {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,7,8,9};
        System.out.println(num(arr));
    }
    public static int num(int arr[]){
        for (int i=0;i<arr.length;i++){
            if(i+1!=arr[i]){
                return i+1;
            }
        }
        return 0;
    }
}
