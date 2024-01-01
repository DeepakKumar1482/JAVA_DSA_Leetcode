import java.util.Queue;

public class queueimpl {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        public Queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public static boolean isempty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public static int remove(){
            if(isempty()){
                return -1;
            }
            int front=arr[0];
            for (int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if (isempty()){
                return -1;
            }
            int front=arr[0];
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(4);
        q.add(2);
        q.add(5);
        q.add(10);
        while (!q.isempty()){
           int peek= q.remove();
            System.out.println(peek);
        }
    }
}
