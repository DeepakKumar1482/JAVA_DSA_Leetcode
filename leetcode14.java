import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode14 {
    static class Node{
        Node []children;
        boolean eow;
        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    //    static ArrayList<String>list=new ArrayList();
    static int l=0;
    static Node root=new Node();
    public static String insert(String word,String []strs){
        Node curr=root;
        String str="";
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            else{
                if(l==strs.length-1){
                    str+=word.charAt(i);
                }
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
        return str;
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String ans="";
        for(;l<strs.length;l++){
            ans=  insert(strs[l],strs);
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        String []strs={"abc","bc","ad","ab","c"};
        longestCommonPrefix(strs);

//        StringBuilder sb=new StringBuilder();
    }

}
