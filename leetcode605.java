public class leetcode605 {
    public static void main(String[] args) {
        int arr[]={1,0,0,0,1,0,0};
        System.out.println( canPlaceFlowers(arr,2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            count++;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i+1]==0 && flowerbed[i-1]==0 && flowerbed[i]==0){
                flowerbed[i]=1;
                count++;
            }
            if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
                flowerbed[flowerbed.length-1]=1;
                count++;
            }
        }
        if(count==n){
            return true;
        }
        return false;
    }
}
