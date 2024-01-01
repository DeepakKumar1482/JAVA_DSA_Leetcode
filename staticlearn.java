public class staticlearn {
    static class Studen{
        String name;
        int roll;
        static int fee;
    }
    public static void main(String[] args) {
//        staticlearn learn=new staticlearn();
       squrare(6);
       Studen s1=new Studen();
       s1.name="Mansi";
       s1.roll=1400;
       s1.fee=2000;
       Studen s2=new Studen();
       s2.name="Rahul";
       s2.roll=1450;
       s2.fee=3000;
        System.out.println(s1.name+"->"+s1.roll+"->"+s1.fee);
        System.out.println(s2.name+"->"+s2.roll+"->"+s2.fee);
//        System.out.println(s1.roll);
//        System.out.println(s2.roll);
    }
    public static int squrare(int num){
        return num*num;
    }
}
