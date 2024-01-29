import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Nasirrecursion {
    public static void main(String[] args) {
        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";
        HashMap<String ,Integer>map1=new HashMap<>();
        HashMap<String ,Integer>map2=new HashMap<>();
        subset(s1,map1,0,"");
        subset(s2,map2,0,"");
    }
    public static void subset(String str,HashMap<String,Integer>map,int idx,String up){
        if(idx==str.length()){
//            map.put(up,1)
            return;
        }
        up+=str.charAt(idx);
        subset(str,map,++idx,up);
        subset(str,map,idx,up.substring(0,up.length()-1));
    }
}
















