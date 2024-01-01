public class duplicate {
    public static void main(String args[]) {
        int array[] = {3, 2, 3, 2, 3};
        int num = 5;//3,2,-1,-1,-1
        int answ = 0;
        int count=0;
        for (int i = 0; i < num; i++) {
            for(int j=i+1;j < num;j++) {//3,2,3,3,3
                if (array[i] == array[j] && array[i]!=-1) {
                    count++;
//                    System.out.print(count+ " ");
                    array[j]=-1;
                    if(count == 1){
                        System.out.println(array[i]);
                    }
                }
               //
            }
       }
    }
//             for(int i = 0; i<num; i++){
//                 System.out.print(array[i]+" ");
//             }
        }



