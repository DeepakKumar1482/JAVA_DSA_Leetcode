import java.util.ArrayList;

public class maximum_water_tostore {
    public static void main(String args[]){
        ArrayList<Integer>hight=new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println(maximum_water_hold(hight));;
    }
    static int maximum_water_hold(ArrayList<Integer>hight){
        int maxwater=0;
        for(int i=0;i<hight.size();i++){
            for(int j=i+1;j<hight.size();j++){
                int high=Math.min(hight.get(i),hight.get(j));
                int width=j-i;
                int current_water=high*width;
                 maxwater=Math.max(maxwater,current_water);
            }
        }
        return maxwater;
    }
}
