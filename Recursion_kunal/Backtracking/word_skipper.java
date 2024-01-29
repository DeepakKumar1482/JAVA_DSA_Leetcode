package Recursion_kunal.Backtracking;

public class word_skipper {
    public static void main(String[] args) {
        System.out.println(Skipper("adeapplecappdf"));
    }
    public static String Skipper(String str){
        if(str.isEmpty()){
            return "";
        }
        if(!str.startsWith("apple") && str.startsWith("app")){
            return Skipper(str.substring(3));
        }
        else{
            return str.charAt(0)+Skipper(str.substring(1));
        }
    }
}
