//you have given a string and you have to find all possible substrings preset and have to print them.
package backtracking;
public class subarrays {
    public static void main(String args[]){
        String str="abc";
        String ans="";
        int ind=0;
        subarray_finder(str,ind,ans);
    }
    public static void subarray_finder(String str,int ind,String ans){
        if(ind==str.length()) {
            if (ans.length() == 0) {
                System.out.println("*");
            } else {
                System.out.println(ans);
            }
            return;
        }
//            This call is for yes = means element at index ind in the str will join ans String.
            subarray_finder(str,ind+1,ans+str.charAt(ind));
            subarray_finder(str,ind+1,ans);
    }
}
