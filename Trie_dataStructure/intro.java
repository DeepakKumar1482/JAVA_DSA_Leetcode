package Trie_dataStructure;

import javax.swing.*;
import java.util.ArrayList;

public class intro {
    static class Node{
        Node []children;
        boolean eow;
        public Node(){
            children=new Node[26];//a to z
            for (int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for (int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public static boolean Search(String word){
        Node curr=root;
        for (int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if (curr.children[idx]==null){
                return false;
            }
            if(i==word.length()-1 && curr.children[idx].eow==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static boolean breaker(String key){
        if(key.length()==0){
            return true;
        }
        for (int i=1;i<=key.length();i++){
            String first=key.substring(0,i);
            String sec=key.substring(i);
            if(Search(first) && breaker(sec)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String []words={"bbad"};
        for (int i=0;i<words.length;i++){
            insert(words[i]);
        }
//        String key="a";
//        System.out.println(breaker(key));
//        System.out.println(Search("any"));
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(1);
//        list.add(5);
//        list.add(66);
//        list.add(9);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
    }
}
