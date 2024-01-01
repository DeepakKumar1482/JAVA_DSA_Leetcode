public class getbit {
    public static void main(String args[]){
        int num=5;
        int position=2;
        int bitmask=1<<position;
        if((bitmask & num)==0){
            System.out.println("Bit on third position is Zero");
        }
        else{
            System.out.println("Bit on third position is Non-Zero");
        }
    }
}
