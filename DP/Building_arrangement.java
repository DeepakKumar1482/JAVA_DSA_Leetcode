package DP;

public class Building_arrangement {
    public static void main(String[] args) {
        System.out.println(building_arrange(3));
    }
    public static int building_arrange(int length){
        int []dpb=new int[length+1];
        int []dps=new int[length+1];
        dpb[1]=1;
        dps[1]=1;
        for ( int i=2;i<=length;i++){
           dpb[i]=dps[i-1];
           dps[i]=dps[i-1]+dpb[i-1];
        }
        return (int) Math.pow(dpb[length]+dps[length],2);
    }
}
