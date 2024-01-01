package OOPs.java;

public class Human {
        int age;
        String name;
        String gender;
        int salary;
        boolean married_status;
        static long population;
        static void mess(){
            System.out.println("Hello my self Deepak");
        }
        public Human(int age,String name,String gender,int salary,boolean married_status){
            this.age=age;
            this.name=name;
            this.gender=gender;
            this.salary=salary;
            this.married_status=married_status;
            Human.population+=1;
            Human.mess();
        }
}
