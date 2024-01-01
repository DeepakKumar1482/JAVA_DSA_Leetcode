package substring_string_questions.java;

public class subsequence_string {
    public static void main(String[] args) {
        String str="abc";
        substr(str,"");
    }
    static void substr(String p,String up){
        if(p.isEmpty()){
            System.out.print(up+" ");
            return ;
        }
        char ch=p.charAt(0);
        substr(p.substring(1),up+ch);
        substr(p.substring(1),up);
    }
}

