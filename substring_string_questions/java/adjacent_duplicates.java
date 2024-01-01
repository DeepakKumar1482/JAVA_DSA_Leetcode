package substring_string_questions.java;

public class adjacent_duplicates {
    public static void main(String[] args) {
        String sen= "abcdaddaab";
        remover(sen,"");
    }
    static void remover(String sent,String upd){
        if(sent.length()==sent.length()-1){
            System.out.println(upd);
            return ;
        }
        char ch=sent.charAt(0);
        if(ch==sent.charAt(1)){
            remover(sent.substring(1),upd);
            //String s1="javatpoint";
            //System.out.println(s1.substring(2,4));//returns va
            //System.out.println(s1.substring(2));//returns vatpoint
        }
        else{
            remover(sent.substring(1),upd+ch);
        }

    }
}
