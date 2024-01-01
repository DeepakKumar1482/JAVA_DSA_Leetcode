package tree_anuj;

//import jdk.incubator.foreign.CLinker;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.lang.runtime.ObjectMethods;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.*;

public class Tree {
    static Scanner sc=null;
   static int sum=0;
  static ArrayList<Integer>Answer=new ArrayList<>();
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=  createTree();
        System.out.println( root.data);
   //     Inorder(root);
       /*preorder(root);*/
//        postorder(root);
//        int height=TreeHeight(root);
//        System.out.println("The height of the Tree is = "+height);
//        levelorder(root);
//        LevelWise(root);
//        System.out.println(TreeSize(root));
//        System.out.println(MaximumValueNode(root));
//          TreeLeftView(root);
        Leftrec(root);
//          TreeRightView(root);
//       Map<Integer,Integer>ans= TreeTopView(root);
//        for (int a:ans.values()) {
//            System.out.print(" "+a+" ");
//        }
//        System.out.println(TreeDiameter(root));
//        boolean Answer= BinarySearchTreeOrNot(root);
//        System.out.println(Answer);
//        System.out.println(BSTorNOT(root));
//        int Result[]=new int[2];
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the value of Key :- ");
//        int key=input.nextInt();
//        Result=FloorAndCielValue(root,key);
//        System.out.println(Arrays.toString(Result));
//        System.out.println(TwoSum(root,220));
    }


    public static Node createTree() {
        Node root=null;
        System.out.print("Enter the data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter left for:"+data);
        root.left=createTree();
        System.out.println("Enter right for:"+data);
        root.right=createTree();
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println("This is Preorder Traversal :- "+root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.println("This is Inorder Traversal :- "+root.data);
        Inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println("This is Postorder Traversal :- "+root.data);
    }
//    Level Order Traversal
    public static void levelorder(Node root){
        LinkedList<Node>list=new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            Node curr=list.poll();
            System.out.print(" "+curr.data+" ");
            if(curr.left!=null){
                list.add(curr.left);
            }
           if(curr.right!=null)list.add(curr.right);
        }
    }
//    public static void Level(Node root){
//        Queue<Node>q=new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        while (!q.isEmpty()){
//            Node curr=q.poll();
//            if(curr==null){
//                if(q.isEmpty()){
//                    return;
//                }
//                else{
//                    System.out.println();
//                    q.add(null);
//                }
//            }
//            else{
//                System.out.print(curr.data);
//                if(curr.left!=null){
//                    q.add(curr.left);
//                }
//                if(curr.right!=null){
//                    q.add(curr.right);
//                }
//            }
//        }
//    }
//    Height of the tree
    public  static int TreeHeight(Node root){
            if(root==null){
                return 0;
            }
            int height=Math.max(TreeHeight(root.left),TreeHeight(root.right))+1;
            return height;
    }
//    Level order with null levelwise
    public static void LevelWise(Node root){
       LinkedList<Node>list=new LinkedList<>();
       list.add(root);
       list.add(null);
       while (!list.isEmpty()){
           Node curr=list.poll();
           if(curr==null){
               if(list.isEmpty()){
                   return;
               }
               else{
                   System.out.println();
                   list.add(null);
               }
           }
           else{
               System.out.println(curr.data);
               if(curr.left!=null){
                   list.add(curr.left);
               }
               if(curr.right!=null){
                   list.add(curr.right);
               }
           }
       }
    }
//    SIZE OF THE TREE (IN TERMS OF NUMBER OF NODES PRESENT IN THE TREE)
    public static int TreeSize(Node root){
        if(root==null){
            return 0;
        }
        int left=TreeSize(root.left);
        int right=TreeSize(root.right);
        int total=left+right+1;
        return total;
    }
//    MAXIMUM VALUE NODE IN THE GIVEN BINARY TREE
    public static int MaximumValueNode(Node root){
        if(root==null){
            return 0;
        }
        int left=MaximumValueNode(root.left);
        int right=MaximumValueNode(root.right);
        return Math.max(Math.max(left,right),root.data);
    }
//    LEFT VIEW OF THE BINARY TREE
public static void TreeLeftView(Node root){
    LinkedList<Node>list=new LinkedList<>();
    list.add(root);
    list.add(null);
    int counter=1;
    Node prev=root;
    while (!list.isEmpty()){
        Node curr=list.poll();
        if(curr!=null && counter==1) {
            System.out.println("THIS IS THE LEFT VIEW OF THE TREE:- "+ curr.data);
            counter=0;
        }
        if(curr==null){
            counter=1;
            if(list.isEmpty()){
                return;
            }
            else{
                list.add(null);
            }
        }
        else{
            if(curr.left!=null){
                list.add(curr.left);
            }
            if(curr.right!=null){
                list.add(curr.right);
            }
        }
    }
}
//
    public static void Leftrec(Node root){
        ArrayList<Node>list=new ArrayList<>();
        printleftview(root,list,0);
        for (Node num:list){
            System.out.println(num.data);
        }
    }
    public static void printleftview(Node root, ArrayList<Node>list,int level){
        if(level==0){
            list.add(root);
        }
        if(root==null){
            return;
        }
        if(list.get(level)==null){
            list.add(root);
        }
        printleftview(root.left,list,level+1);
        printleftview(root.right,list,level+1);
    }
//    RIGHT VIEW OF THE BINARY TREE
    public static void TreeRightView(Node root){
        LinkedList<Node>list=new LinkedList<>();
        list.add(root);
        list.add(null);
        Node prev=root;
        while (!list.isEmpty()){
            Node curr=list.poll();
            if(curr!=null) {
                prev = curr;
            }
            if(curr==null){
                System.out.println("THIS IS THE RIGHT VIEW OF THE TREE :- "+prev.data);
                if(list.isEmpty()){
                    return;
                }
                else{
                    list.add(null);
                }
            }
            else{
                if(curr.left!=null){
                    list.add(curr.left);
                }
                if(curr.right!=null){
                    list.add(curr.right);
                }
            }
        }
    }
    //                public static void TreeTopView(Node root){
//        System.out.println(root.data);
//      LeftTopView(root.left);
//      RightTopView(root.right);
//    }
//    public static void LeftTopView(Node root){
//        if(root==null){
//            return;
//        }
//        System.out.println(root.data);
//        LeftTopView(root.left);
//    }
//    public static void RightTopView(Node root){
//        if(root==null){
//            return;
//        }
//        System.out.println(root.data);
//        RightTopView(root.right);
//    }

//    TOP VIEW OF THE GIVEN BINARY TREE ( WE WILL BE USING THE CONCEPT OF HORIZONTAL
//    DISTANCE FROM THE ROOT NODE TO GET THE CORRECT TOP VIEW OF THE GIVEN BINARY TREE
    public static Map<Integer,Integer> TreeTopView(Node root){
        Queue<Pair>q=new ArrayDeque<>();
        Map<Integer,Integer>map=new TreeMap<>();
        q.add(new Pair(0,root));
        while (!q.isEmpty()){
            Pair curr=q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data);
                System.out.println(curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        return map;
    }
//  DIAMETER OF THE GIVEN BINARY TREE
    static int  ans=0;
//    In this TreeDiameter Our Answer is ans which we have to print at the end.
    public static int TreeDiameter(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=TreeDiameter(root.left);
        int rightheight=TreeDiameter(root.right);
//        int lh=TreeHeight(root.left);
//        int rh=TreeHeight(root.right);
        ans=Math.max(1+leftheight+rightheight,ans);
        return 1+Math.max(leftheight,rightheight);
    }
//    BINARY SEARCH TREE
//    CHECK WEATHER THE GIVEN TREE IS BINARY SEARCH TREE OR NOT
    public static boolean BinarySearchTreeOrNot(Node root){
       int LeftMax= checker1(root.left);
       int RightMin= checker2(root.right);
        if(root.data>LeftMax && root.data<RightMin){
            return true;
        }
        return false;
    }
//    WE WILL CHECK WHICH IS THE LARGEST ELEMENT IN THE LEFT SUBTREE
//    AND WILL ALSO CHECK WHICH IS THE SMALLEST ELEMENT FOR THR RIGHT SUBTREE
   static int max=Integer.MIN_VALUE;
   static int min=Integer.MAX_VALUE;
    public static int checker1(Node root){
        if(root==null){
            return 0;
        }
        if(root.data>max){
            max=root.data;
        }
        checker1(root.left);
        checker1(root.right);
        return max;
    }
    public static int checker2(Node root){
        if(root==null){
            return 0;
        }
        if(root.data<min){
            min=root.data;
        }
        checker2(root.left);
        checker2(root.right);
        return min;
    }
//    ANOTHER WAY TO CHECK WEATHER THE GIVEN BINARY TREE IS BINARY SEARCH TREE OR NOT
//    THEN WE CAN USE ANOTHER WAY WHICH IS USED BELOW
//    ACCORDING TO THIS WAY WILL BE DOING INORDER TRAVERSAL AND WOULD WE STORING THE NODES IN THE ARRAYLIST AND WOULD SEE
//    WEATHER THAT ARRAYLIST IS SORTED OR NOT
    static ArrayList<Integer>list=new ArrayList<>();
    public static boolean BSTorNOT(Node root){
        Helper(root);
        return IsSorted();
    }
    public static void Helper(Node root){
        if(root==null){
            return;
        }
        Helper(root.left);
        list.add(root.data);
        Helper(root.right);
    }
    public static boolean IsSorted(){
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    return false;
                }
            }
        }
        return true;
    }
//    FLOOR AND CIEL VALUE IN THE GIVEN BINARY TREE
    static ArrayList<Integer>CielList=new ArrayList<>();
    public static int[] FloorAndCielValue(Node root, int num){
        int ans[]=new int[2];
        Adder(root);
        for ( int i=0;i<CielList.size();i++){
            if(CielList.get(i)<num && CielList.get(i+1)>num){
                ans[0]= CielList.get(i);
                ans[1]=CielList.get(i+1);
                return ans;
            }
           else if(CielList.get(i)< num && i==CielList.size()-1){
                ans[0]=CielList.get(i);
                ans[1]=Integer.MAX_VALUE;
                return ans;
            }
           if(CielList.get(i)>num && i==CielList.size()-1){
               ans[0]=Integer.MIN_VALUE;
               ans[1]=Integer.MAX_VALUE;
               return ans;
           }
        }
        return ans;
    }
    public static void  Adder(Node root){
        if(root==null){
            return;
        }
        Adder(root.left);
        CielList.add(root.data);
        Adder(root.right);
    }
//    CHECK WEATHER THE TWO NODES WITH THE SUM OF GIVEN NUMBER PRESENT IN THE TREE OR NOT
  static   HashMap<Integer,Integer>map=new HashMap();
  static int l=0;
    public static boolean TwoSum(Node root,int num){
        if(root==null){
            return false;
        }
        if(TwoSum(root.left,num)==true){
            return true;
        }
        if(map.containsKey(num-root.data)){
            return true;
        }
        map.put(root.data,l);
        l++;
        ArrayList<String>list=new ArrayList<>();
        list.add("abc");
        System.out.println(list.size());
        HashMap<String ,Integer>map=new HashMap<>();
        map.size();

        return TwoSum(root.right,num);
    }
}


 class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
    }
 }
class Pair{
    int hd;
    Node node;
    public Pair(int hd, Node node) {
        this.hd = hd;
        this.node = node;
    }
}