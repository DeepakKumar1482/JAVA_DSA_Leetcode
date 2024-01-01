public class find_notgiven_num {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 5};
        int num = 5;
        int ans=MissingNumber(arr,num);
        System.out.println(ans);
    }
      static  int MissingNumber(int array[], int n) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<4;i++){
            sum=sum+array[i];
        }
        for(int j=1;j<=5;j++){
            sum1=sum1+j;
        }
        return (sum1-sum);
      }

        }


