import java.util.ArrayList;
import java.util.List;

public class leetcode706 {
   static List<List<Pair>>list;
    public class Pair{
        int key;
        int value;
        public  Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public class MyHashMap{
        List<Pair>l;
        public  MyHashMap(int key,int value){
            Pair p=new Pair(key,value);
            l.add(p);
            list.add(l);
        }
        public void put(int key, int value){
            MyHashMap map=new MyHashMap(key,value);
            for (int i=0;i<list.size();i++){
                System.out.println(list);
            }
        }
    }
}
