public class leetcode4 {
    public static void main(String[] args) {
        int nums1[] = {1, 2};
        int nums2[] = {3, 4};
        System.out.println(medain(nums1, nums2));
    }
    public static double medain(int nums1[],int nums2[]){
        int mergearr[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            mergearr[i]=nums1[i];
        }
        for(int j=0;j< nums2.length;j++) {
            mergearr[nums1.length + j] = nums2[j];
        }
        if(mergearr.length%2!=0){
            return mergearr[mergearr.length/2];
        }
        else{
            double ans2=(mergearr[mergearr.length/2]+mergearr[mergearr.length/2-1])/2;
            return ans2;
        }
    }
}
