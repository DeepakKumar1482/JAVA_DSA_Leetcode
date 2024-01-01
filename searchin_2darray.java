import java.util.*;
public class searchin_2darray {
    public static void main(String []args){
        System.out.println("Enter the number of rows");
        Scanner in =new Scanner(System.in);
        int row=in.nextInt();
        System.out.println("Enter the number of columns");
        int col=in.nextInt();
        int [][]arr=new int [row][col];
        int len=arr.length;
        System.out.println(len);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                arr[i][j] = in.nextInt();
            }
            }
        System.out.println("Hello world");
        int target=in.nextInt();
         int [] ans=search_num(arr,target,col);
        System.out.println(Arrays.toString(ans));
    }
 public  static  int[] search_num(int ar[][],int tar,int co){
        int leng=ar.length;
        for(int k=0;k<leng;k++){
            for(int l=0;l<co;l++){
                if(ar[k][l]==tar){
                    return new  int []{k,l};
                }
            }
        }
       return new int []{-1};
   }
}
