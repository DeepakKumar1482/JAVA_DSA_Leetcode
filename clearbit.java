public class clearbit {
    public static void main(String args[]){
        int num=5;
        int pos=1;
        int Bitmask=1<<pos;
        int bitmasknew=~Bitmask;
        int newnum=bitmasknew & num;
        System.out.println(newnum);
    }
}
