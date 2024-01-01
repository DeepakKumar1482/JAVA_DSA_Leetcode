public class recursion_finding_target_elem {
   public static void main (String args[]){
       int arr[]={5,6,7,8,1,2,3,4};
      int ans= index(arr,2,0,arr.length-1);
       System.out.println(ans);
   }
   static int index(int nums[],int target,int start,int end){
       int mid=start+(end-start)/2;
       if(nums[mid]==target){
           return mid;
       }
       if(nums[start]<=nums[mid]){
           if(nums[start]<=target && target<=nums[mid]){
               end=mid-1;
               return index(nums,target,start,end);
           }
           else{
               start=mid+1;
               return index(nums,target,start,end);
           }
       }
       if(target>=nums[mid] && target<=nums[end]){
           start=mid+1;
           return index(nums,target,start,end);
       }

       return index(nums,target,start,mid-1);
   }
}
