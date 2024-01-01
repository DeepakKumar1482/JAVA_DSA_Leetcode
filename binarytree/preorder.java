//Preorder Tree traversal
package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class preorder {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }
//    below code is to find the Root node
    static class Binarytree{
        static int ind=-1;
        public static Node buildtree(int nodes[]){
            ind++;
            if(nodes[ind]==-1){
                return null;
            }
            Node newNode=new Node(nodes[ind]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
            if(root==null){
                return;
            }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
            if(root==null){
                return ;
            }
            postorder(root.left);
            postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root){
            if(root==null){
                return;
            }
        Queue<Node>queue=new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()){
                Node currNode=queue.remove();
                if(currNode==null){
                    System.out.println();
                    if(queue.isEmpty()){
                        break;
                    }
                    else {
                        queue.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
    }
//    Height of a tree (from deepest leaf)
    public  static  int TreeHeight(Node root){
            if(root==null){
                return 0;
            }
            int leaft_hg=TreeHeight(root.left);
            int right_hg=TreeHeight(root.right);
            int height=Math.max(leaft_hg,right_hg)+1;
            return height;
    }
    public static int TreeNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftNodes=TreeNodes(root.left);
            int rightNodes=TreeNodes(root.right);
            int TotalNodes=leftNodes+rightNodes+1;
            return TotalNodes;
    }
    public static int TreeSum(Node root,int sum){
            if(root==null){
                return 0;
            }
            Queue<Node>queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node currnode=queue.remove();
                if(currnode.left!=null){
                    queue.add(currnode.left);
                }
                if(currnode.right!=null) {
                    queue.add(currnode.right);
                }
              sum=sum+currnode.data;
            }
            return sum;
    }
    static  class Info{
        int dia;
        int ht;

        public Info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftinfo=diameter(root.left);
        Info rightinfo=diameter(root.right);
        int diam=Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht+1);
        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
        return new Info(diam,ht);
    }
    }
//our three as input
//               1
//            /     \
//           2        3
//          /  \       \
//         4    5        6
//    Preorder tree traversal (In preorder traversal we print root node first)then left node and in last
//    we print right node;
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root=tree.buildtree(nodes);
//        System.out.println(root.data);
//        tree.inorder(root);
//        tree.postorder(root);
//        System.out.println(tree.TreeSum(root,0));
        System.out.println(tree.diameter(root).ht);
    }
}
