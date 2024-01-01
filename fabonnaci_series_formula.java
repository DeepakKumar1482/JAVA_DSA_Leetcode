public class fabonnaci_series_formula {
    public static void main(String args[])
    {
        for(int i=0;i<11;i++){
            System.out.println(fibbormulua(i));
        }
    }
    static int  fibbormulua(int n){
      int ans= (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-(Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5));
      return ans;
    }
}
