import java.util.Scanner;

public class intro {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=CreateTree();
        preorder(root);
    }
    public static Node CreateTree(){

        Node root= null;
        System.out.println("Enter the data");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter left for :"+data);
        root.left=CreateTree();
        System.out.println("Enter right for:"+data);
        root.right=CreateTree();
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);
    }
    static class Node{
        Node right,left;
        int data;
        public Node(int data){
            this.data=data;
        }
    }
}
