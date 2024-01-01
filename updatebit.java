public class updatebit {
    public static void main(String args[]){
        int num=5;
        int pos=2;
        int Bitmask=1<<pos;
        int bitmasknew=~Bitmask;
        int newnum=bitmasknew & num;
        System.out.println(newnum);
    }
}


