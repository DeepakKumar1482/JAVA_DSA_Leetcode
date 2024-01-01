public class t {
    static class User{
        int roll_num=1;
        String name="deepak";
        public User(int a,String b){
            this.roll_num=a;
            this.name=b;
        }
    }

    public static void main(String[] args) {
        User an=new User(12,"Rahul");
        System.out.println(an.name);
    }
}
