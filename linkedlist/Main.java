package linkedlist;
public class Main {
    public static void main(String[] args) {
   LL list=new LL();
        list.insert(5,0);
        list.insert(52,1);
        list.insert(45,2);
        list.insert(19,3);
        list.insert(78,4);
        list.insert(90,5);
        list.delete(2);
        list.insert_first(23);
        list.display();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.delete_last());
//        list.display();
//         System.out.println(list.delete(2));
//        System.out.println(list.find(45));
//         list.display();
//        DLL list=new DLL();
//        list.insertFirst(2);
//        list.insertFirst(23);
//        list.insertFirst(12);
//        list.insertFirst(45);
//        list.inserLast(95);
//        list.display();
//        list.insert(12,76);
//        list.display();
    }
}
