package binarytree;
import java.util.*;
import java.util.ArrayList;

public class node_counting {
    static class Node{
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int no_nodes(Node root,int count){
        if(root==null){
            return 0;
        }
        int leftcount=no_nodes(root.left,count++);
       int rightcount= no_nodes(root.right,count++);
        return leftcount+rightcount+1;
    }
    public static int node_sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=node_sum(root.left);
        int rightsum=node_sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static boolean getpath(Node root,int n,ArrayList<Node>path){
        if(root==null){
            return false;
        }

        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundleft=getpath(root.left,n,path);
        boolean foundright=getpath(root.right,n,path);
        if(foundleft||foundright){
            return true;
        }
//        path.remove(path.size()-1);
        path.remove(path.size()-1);
        return false;
    }
    public static Node lowest_comm_ancestor(Node root,int n1,int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i=0;
        for(;i< path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lowest_comm_anchestor=path1.get(i-1);
        return lowest_comm_anchestor;
    }
    public static Node lca2(Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }
        Node leftlca=lca2(root.left,n1,n2);
        Node rightlaca=lca2(root.right,n1,n2);
        if(rightlaca==null){
            return leftlca;
        }
        if(leftlca==null){
            return rightlaca;
        }
        return root;
    }
//Minimum distance between two node
//To find minimum distance we will use lca method as the
// lowest distance is the distance of node from lca each side
    public static int minDis(Node root,int n1,int n2){
        Node lca=lca2(root,n1,n2);
        int min_dis_left=lcaDis(lca,n1);
        int min_dis_right=lcaDis(lca,n2);
        return min_dis_left+min_dis_right;
    }
    public static int lcaDis(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n) {
            return 0;
        }
        int leftDist=lcaDis(root.left,n);
        int rightDis=lcaDis(root.right,n);
        if(leftDist==-1 && rightDis==-1){
            return -1;
        } else if (leftDist==-1) {
            return rightDis+1;
        }else{
            return leftDist+1;
        }
    }
    public static int KAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDis=KAncestor(root.left,n,k);
        int rightDis=KAncestor(root.right,n,k);
        if(leftDis==-1 && rightDis==-1){
            return -1;
        }
        int max=Math.max(leftDis,rightDis);
        if(max+1==k){
            System.out.println("This is kth ancestor : "+root.data);
        }
        return max+1;
    }
    public static int  transform(Node root){
        if(root==null){
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild=transform(root.right);
        int data= root.data;
        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //    our three as input
//               1
//            /    \
//           2       3
//          /  \    /  \
//         4    5  6   7
    public static void kth_level(Node root,int level,int k){
        if(root==null) {
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kth_level(root.left,level+1,k);
            kth_level(root.right,level+1,k);
    }
    //    our three as input
//               1
//            /    \
//           2       3
//          /  \    /  \
//         4    5  6   7
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
//        root.right.left=new Node(6);
        root.right.right=new Node(6);
        int n1=2;
        int n2=6;
        int k=3;
//        kth_level(root,1,k);
//        System.out.println(KAncestor(root,n1,k));
//        transform(root);
//        preorder(root);

    }
}
