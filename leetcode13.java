import java.util.HashMap;

public class leetcode13 {
    public static void main(String[] args) {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        String s="LVIII";
        int sum=0;
//        if(hm.get(s.charAt(s.length()-1))>hm.get(s.charAt(s.length()-2))){
//            sum=sum-hm.get(s.charAt(s.length()-2));
//        }
        for( int i=s.length()-1;i>=0;i--){
            if(i>0 && hm.get(s.charAt(i))>hm.get(s.charAt(i-1))  ){
                sum=sum-hm.get(s.charAt(i-1))+hm.get(s.charAt(i));
                i--;
            }
            else{
                sum=sum+hm.get(s.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
