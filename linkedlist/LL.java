package linkedlist;

import java.util.LinkedList;

public class LL {
    private  Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }
    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null  ;
        }
        size--;
        return val;
    }
    public int  delete_last(){
        if (size<=1){
           return deleteFirst();
        }
        Node second_last=get(size-2);
        int val= tail.value;
        tail=second_last;
        tail.next=null;
        return val;
    }
    public int delete(int index){
        if(index==0){
           return delete_last();
        }
        if(index==size-1){
            return delete_last();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
    public Node find(int val){
        Node node=head ;
        while (node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node=head ;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void insert(int val,int index){
        if(index==0){
            insert_first(val);
        }
        else if (index==size) {
            insertLast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void insertLast(int val){
        if (tail==null){
            insert_first(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert_first(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if (tail == null) {
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {

            this.value = value;
        }

        public Node(int value, Node next) {
            this.value=value;
            this.next = next;
        }
    }
//    leetcode problem 83. Remove Duplicates from Sorted List
    public void duplicates(){
    Node node=head;
    while(node!=null){
        if(node.value==node.next.value){
            node.next=node.next.next;
            size--;
        }
        else{
             node=node.next;
        }
    }
        tail=node;
        tail.next=null;
    }
    public static void main(String args[]){
//        LinkedList<Integer>list=new LinkedList<>();
        LL list=new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(5);
        list.display();;
        list.duplicates();
        list.display();
    }

}
