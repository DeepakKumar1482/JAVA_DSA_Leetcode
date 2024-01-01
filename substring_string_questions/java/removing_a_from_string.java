//Removing all the "a" from a given string with the help of recursion//
package substring_string_questions.java;
public class removing_a_from_string {
    public static void main(String[] args) {
        String sen= "abcdaddaab";
        remover(sen,"");
    }
    static void remover(String sent,String upd){
        if(sent.isEmpty()){
            System.out.println(upd);
            return ;
        }
        char ch=sent.charAt(0);
        if(ch=='a'){
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
