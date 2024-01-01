import java.util.ArrayList;

public class subarrayleet {
    public static void main(String[] args) {
        int a[]={4,5,6,7,7};
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                list.add(a[j]);
            }
            System.out.println("["+list+"]");
        }
    }
}
