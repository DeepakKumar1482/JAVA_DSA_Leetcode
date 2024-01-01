package binary_tree_revision;

import javax.management.NotificationFilter;
import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class binarytree_part1 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
//    function for building the tree
    static class Binarytree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
           idx++;
           if(nodes[idx]==-1){
               return null;
           }
           Node newNode=new Node(nodes[idx]);
           newNode.left=buildtree(nodes);
           newNode.right=buildtree(nodes);
           return newNode;
        }
//        preorder tree formation
    public static void preorder(Node root){
           if(root==null){
               return;
           }
           System.out.println(root.data);
           preorder(root.left);
           preorder(root.right);
    }
    public static boolean search(Node root,int target){
            if(root==null){
                return false;
            }
            if(root.data==target){
                return true;
            }
            if(root.data>target){
                search(root.left,target);
            }
            return search(root.right,target);

    }
    public static Node insert(Node root, int key){
            Node newnode=new Node(key);
            Node curr=root;
            Node parent=null;
            while (curr!=null){
                parent=curr;
                if(curr.data>key) {
                    curr=curr.left;
                }
                else{
                    curr=curr.right;
                }
            }
            if(parent==null){
                root=newnode;
            }
            else if(parent.data>key){
                parent.left=newnode;
            }
            else{
                parent.right=newnode;
            }
            return root;
    }
//    Inorder tree formation
     public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
         System.out.print(root.data+" ");
         inorder(root.right);
     }
//     postorder tree formation
    public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
        System.out.print(root.data+" ");
    }
//    level order traversal revision
    public void level(Node root){
           Queue<Node>q=new LinkedList<>();
           q.add(root);
           q.add(null);
           while (!q.isEmpty()){
               Node curr=q.poll();
               if(curr==null){
                   if(q.isEmpty()){
                       return;
                   }
                   else{
                       if(curr==null){
                           System.out.println();
                           q.add(null);
                       }
                   }
               }
               else{
                   System.out.println(curr.data);
                   if(curr.left!=null){
                       q.add(curr.left);
                   }
                   if(curr.right!=null){
                       q.add(curr.right);
                   }
               }
           }
    }
//    printing level order traversal levelwise
    public void levelwise(Node root){
            if(root==null){
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node curr=q.poll();
                if(curr==null) {
                    if (q.isEmpty()) {
                        return;
                    } else {
                        q.add(null);
                        System.out.println();
                    }
                }
                else {
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
    }
//    level order tree formation
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
                   }else {
                       queue.add(null);
                   }
               }
               if(currNode!=null){
                   System.out.print(currNode.data+" ");
                   if(currNode.left!=null){
                       queue.add(currNode.left);
                   }
                   if(currNode.right!=null){
                       queue.add(currNode.right);
                   }
               }
           }
    }



//    left view revision using queue
public static void leftview_tree(Node root){
            Queue<Node>q=new LinkedList<>();
            System.out.println(root.data);
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.poll();
                if (curr == null) {
                    if (q.isEmpty()) {
                        return;
                    } else {
                        q.add(null);
//                        System.out.println();
                    }
                }

                else {
                    if (curr.left != null) {
//                        System.out.println(curr.left.data);
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        System.out.println(curr.right.data);
                        q.add(curr.right);
                    }
                }
            }
}
//    Maximum value node in a given binary tree
    public static int maximum_node(Node root){
         if(root==null){
             return 0;
         }
         int left_node=maximum_node(root.left);
         int right_node=maximum_node(root.right);
         int maximum=Math.max(Math.max(left_node,right_node),root.data);
         return maximum;
    }
//    Minimum value node in a given binary tree
    public static int minimum_node(Node root,int prev){
        if(root==null) {
            return prev;
        }
        int left_node=minimum_node(root.left,prev);
        int right_node=minimum_node(root.right,prev);
        int minimum=Math.min(Math.min(left_node,right_node),root.data);
        return minimum;
    }
//    size of the binary tree
    public static  int tree_size(Node root){
        Queue<TreeNode>q=new LinkedList<>();

            if(root==null){
                return 0;
            }
            int left_nodes=tree_size(root.left);
            int right_nodes=tree_size(root.right);
            int total_nodes=left_nodes+right_nodes+1;
            return  total_nodes;
    }
//    height of a tree in terms of nodes
//    public static int tree_height(Node root){
//            if(root==null){
//                return 0;
//            }
//            int lh=tree_height(root.left);
//            int rh=tree_height(root.right);
//            int hgt=Math.max(lh,rh)+1;
//            return hgt;
//    }
    public static  int tree_height(Node root){
        if(root==null){
            return 0;
        }
        int lh=tree_height(root.left);
        int rh=tree_height(root.right);
        int height=Math.max(lh,rh)+1;
        return height;
    }
//    count of nodes
    public static int count_nodes(Node root){
        if(root==null){
            return 0;
        }
        int ln=count_nodes(root.left);
        int rn=count_nodes(root.right);
        int tn=ln+rn+1;
        return tn;
    }
//    sum of All nodes' values
    public static int nodes_sum(Node root){
           if(root==null){
               return 0;
           }
           int lns=nodes_sum(root.left);
           int rns=nodes_sum(root.right);
           int tns=lns+rns+root.data;
           return tns;
    }
//    diameter of the tree(Maximum path between two leaves)-time complexity-n square()n^2.
    public static int tree_diameter(Node root){
            if(root==null){
                return 0;
            }
            int leftdia=tree_diameter(root.left);
            int rightdia=tree_diameter(root.right);
            int lefthigt=tree_height(root.left);
            int righthigt=tree_height(root.right);
            int selfdia=lefthigt+righthigt+1;
            int diameter=Math.max(selfdia,Math.max(leftdia,rightdia));
            return diameter;
    }
//    finding the diameter of the tree while time complexity is n.
//    In this process we are calculating the height and diameter (EK SATH).that's why time complexity is n.
//    for this we have made a static class Info. which consits of two information diameter and height;
    static class Info{
            int dia;
            int height;

        public Info(int dia, int height) {
            this.dia = dia;
            this.height = height;
        }
    }
    public static Info diameter(Node root){
            if(root==null){
                return null;
            }
            Info leftInfo=diameter(root.left);
            Info rightInfo=diameter(root.right);
            int dia=Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.height+rightInfo.height+1);
            int height=Math.max(leftInfo.height, rightInfo.height)+1;
            return new Info(dia,height);
    }
//    subtree of the given tree
    public static boolean isIdentical(Node root,Node subroot){
            if(root==null && subroot== null){
                return true;
            } else if (root==null || subroot==null || root.data!=subroot.data) {
                return false;
            }
            if(!isIdentical(root.left,subroot.left))
        {
            return false;
        }
        if(!isIdentical(root.right,subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subroot){
            if(root==null){
                return false;
            }
            if (root.data==subroot.data){
                if(isIdentical(root,subroot)) {
                    return true;
                }
            }
           boolean leaftans= isSubtree(root.left,subroot);
           boolean rightans= isSubtree(root.right,subroot);
           return (leaftans || rightans);
    }
    }
    //           1
//            /     \
//           2       3
//         /  \     /  \
//        4    5   6    7
    public static void main(String[] args) {
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right=new Node(3);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        subtree
//        Node subroot=new Node(2);
//        subroot.left=new Node(4);
//        subroot.right=new Node(5);
//        Binarytree tree=new Binarytree();
//        System.out.println(tree.isSubtree(root, subroot));
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Binarytree tree=new Binarytree();
       Node root= tree.buildtree(nodes);
//        System.out.println(root.data+" ");
//        tree.preorder(root);
//        System.out.println("Inorder :- ");
//        tree.inorder(root);
//        System.out.println("Postorder :- ");
//        tree.postorder(root);
//        tree.levelorder(root);
//        int height=tree.tree_height(root);
//        System.out.println();
//        System.out.println("Tree Height is :- "+height);
//        int nodes_count=tree.count_nodes(root);
//        System.out.println(nodes_count);
//        int sum=tree.nodes_sum(root);
//        System.out.println("Total Nodes sum:- "+sum);
//        int no_of_nodes=tree.tree_size(root);
//        System.out.println(no_of_nodes);
//        int minimum_node=tree.minimum_node(root,root.data);
//        System.out.println(minimum_node);
//          tree.level(root);
//        System.out.println(su);
        tree.leftview_tree(root);
//        int treediameter=tree.tree_diameter(root);
//        System.out.println(treediameter);
    }
}
