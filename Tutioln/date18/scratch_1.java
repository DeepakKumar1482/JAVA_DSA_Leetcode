package Tutioln.date18;

public class scratch_1 {
    static Node head;
    private static int size;
    scratch_1(){
        this.size=0;
    }
    static class Node
    {
        String val;
        Node next;
        public Node(String val){
            this.val=val;
            size++;
        }
    }
    public void addfirst(String data){
        Node Newnode=new Node(data);
        if(head==null){
            head=Newnode;
            return;
        }
        Newnode.next=head;
        head=Newnode;
    }
    public static void printlist(scratch_1 list){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node cur=head;
        while (cur!=null)
        {
            System.out.print(cur.val+"=>");
            cur=cur.next;
        }
        System.out.println("null");
    }
    public static Node rev(Node head){
        Node temp =head;
        Node cur = head;
        Node prv=null;
        while(cur!=null)
        {
            temp=cur.next;
            cur.next=prv;
            prv=cur;
            cur=temp;//You didn't update the curr that's why it was going infinite
        }
        return prv;
    }
    public static void main(String[] args) {
        scratch_1 list = new scratch_1();
        list.addfirst("H");
        list.addfirst("E");
        list.addfirst("L");
        list.addfirst("L");
        list.addfirst("O");
        list.printlist(list);
        Node ans=list.rev(list.head);
//        Through this while loop I have printed the nodes from ans to the tail of the linkedlist.
        while(ans!=null){
            System.out.print(ans.val+"=>");
            ans=ans.next;
        }
//        list.printlist(list);
    }
}
