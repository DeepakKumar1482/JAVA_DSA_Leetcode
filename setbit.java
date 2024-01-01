public class setbit {
    public static void main(String args[]){
        int num=5;
        int pos=1;
        int bitmask=1<<pos;
        int newnum=bitmask|num;
        System.out.println(newnum);
    }
}
