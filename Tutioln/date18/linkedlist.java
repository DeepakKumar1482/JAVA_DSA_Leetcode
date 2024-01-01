package Tutioln.date18;

import java.util.LinkedList;

public class linkedlist {
    static Node head;
    private static int size;
    linkedlist(){

        this.size=0;
    }
    static class Node{
    String val;
    Node next;
    public Node(String  val){
        this.val=val;
//        this.next=null;
        size++;
    }
//    String str=new String("deepak");
    }
    public void addFirst(String data){
        Node Newnode=new Node(data);
        if(head==null){
            head=Newnode;
            return;
        }
        Newnode.next=head;
        head=Newnode;
    }
    public static void addLast(String data){
        Node Newnode=new Node(data);
        if(head==null){
            head=Newnode;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=Newnode;
    }
    public static void printlist(linkedlist list){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.val+" =>");
            curr=curr.next;
        }
        System.out.print("Null");
    }
    public static void deleteFirst(){
        if(head==null){
            return;
        }
        size--;
        head=head.next;
    }
    public static void deleteLast(){
        if (head==null){
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node SecondLast=head;
        Node Last=head.next;
        while (Last.next!=null){
            Last=Last.next;
            SecondLast=SecondLast.next;
        }
        SecondLast.next=null;
    }
//    static int a=5;
    public static void duplicate(Node head){
        Node curr=head;
//        Node fast=head.next;
        while (curr.next!=null){
            if(curr.val== curr.next.val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
    }
    public static int getSize(){

        return size;
    }
    public static void main(String[] args) {
//        String str=new String("HEllo");
//        str.charAt(0);
     linkedlist list=new linkedlist();
     list.addFirst("h");
     list.addFirst("h");
     list.addLast("e");
        list.addLast("b");
        list.addLast("b");
        list.addLast("c");
        list.addLast("c");
        list.addLast("f");
//        list.addLast("f");
//     list.addFirst("hyy");
//     printlist(list);
//     deleteFirst();
//     deleteLast();
//     printlist(list);
     duplicate(list.head);
     printlist(list);
//        System.out.println(head.val);
//        System.out.println(getSize());
    }
}
