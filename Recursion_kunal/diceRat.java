package Recursion_kunal;

import java.util.HashMap;

public class diceRat {
    public static void main(String[] args) {
        DiceRat("",3);
    }
    public static void DiceRat(String num,int target){
        if (target==0){
            System.out.println(num);
            return;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        map.values();
//        map.containsValue()
        for (int i=1;i<=6 && i<=target;i++){
            DiceRat(num+i,target-i);
        }
    }
}
