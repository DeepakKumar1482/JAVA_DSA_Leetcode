public class trie_dsa {
    static class Node{
        Node []child;
        boolean eow;
        public Node(){
            child=new Node[26];
            for(int i=0;i<26;i++){
                child[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.child[idx].eow=true;
            }
            curr=curr.child[idx];
        }
    }
    public static void main(String[] args) {
        String arr[]={"the","a","there","their","any"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
    }
}
