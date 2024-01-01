package OOPs.java;

public class enums {
    enum Week{
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
    }
    public static void main(String args[]){
        Week week;
        week=Week.Sunday;
        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
