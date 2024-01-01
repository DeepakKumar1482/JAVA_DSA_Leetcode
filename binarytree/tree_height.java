package binarytree;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class tree_height {
    static class Node{
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
//    public static int tree_height(Node root){
//        if(root==null){
//            return 0;
//        }
//        int left_height=tree_height(root.left);
//        int right_height=tree_height(root.right);
//        return Math.max(left_height,right_height)+1;
//    }
//    public static int rootdiameter(Node root){
//        if(root==null){
//            return 0;
//        }
//        int leftdia=rootdiameter(root.left);
//        int lefthigh=tree_height(root.left);
//        int rightdia=rootdiameter(root.right);
//        int righthigh=tree_height(root.right);
//        int selfdia= righthigh+lefthigh+1;
//        int maxdia=Math.max(selfdia,Math.max(leftdia,rig1tdia));
//        return maxdia;
//    }
//    static class Info{
//        int dia;
//        int height;
//
//        public Info(int dia, int height) {
//            this.dia = dia;
//            this.height = height;
//        }
//    }
//    public static Info rootdiameter2(Node root){
//        if(root==null){
//            return new Info(0,0);
//        }
//        Info leftInfo=rootdiameter2(root.left);
//        Info rightInfo=rootdiameter2(root.right);
//        int dia=Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.height+rightInfo.height+1);
//        int height=Math.max(leftInfo.height,rightInfo.height)+1;
//        return new Info(dia,height);
//    }
    public static boolean isIdentical(Node node,Node subroot){
        if(node==null && subroot==null){
            return true;
        } else if (node==null||subroot==null|| node.data!=subroot.data){
            return false;
        }
        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if(!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean issubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return issubtree(root.left,subroot)||issubtree(root.right,subroot);
    }
    static class info{
        Node node;
        int hd;
        public info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topview(Node root){
        Queue<info>queue=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0,max=0;
        queue.add(new info(root,0));
        queue.add(null);
        while (!queue.isEmpty()){
            info curr=queue.remove();
            if(curr==null){
                if(queue.isEmpty()){
                    break;
                }
                else {
                    queue.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left!=null){
                    queue.add(new info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    queue.add(new info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
    }
    public static void klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        klevel(root.left,level+1,k);
        klevel(root.right,level+1,k);
    }
//    our three as input
//               1
//              /  \
//             2    3
//           /  \  /  \
//          4    5 6   7
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
//        Node subroot=new Node(2);
//        subroot.left=new Node(4);
//        subroot.right=new Node(5);
//        System.out.println(issubtree(root,subroot));
//        topview(root);
        int k=3;//Here k is the level which nodes you want to print
        klevel(root,1,k);
    }
}
