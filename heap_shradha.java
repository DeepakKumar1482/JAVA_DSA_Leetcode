import java.util.ArrayList;

public class heap_shradha {
    static class Heap{
       static ArrayList<Integer>list=new ArrayList<>();
        public static void add(int data){
            list.add(data);
            int child=list.size()-1;
            int par=(child-1)/2;
            while (list.get(child)<list.get(par)){
                int temp=list.get(child);
                list.set(child,list.get(par));
                list.set(par,temp);
                child=par;
                par=(child-1)/2;
            }
        }
    }
    public static void main(String[] args) {

    }
}
