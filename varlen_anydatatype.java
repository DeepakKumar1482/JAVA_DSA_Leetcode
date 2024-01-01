import java.util.Arrays;

public class varlen_anydatatype {
        public static void main(String args[]){
            multiple(1,2,"kumar","Rahul","Deepak");
        }
        static void multiple(int a,int b,String ...v){
            System.out.println(Arrays.toString(v));
        }
    }


