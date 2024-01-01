//Removing any substring which is given from the String
//in this question i have removed "apple"(substring) from the given string
package substring_string_questions.java;
public class removing_substring {
    public static void main(String[] args) {
        String str = "afglkapplysdjgapple";
        new_string(str,"");
    }

    static void new_string(String str,String upd) {
      if(str.isEmpty()){
          System.out.println(upd);
          return;
      }
      char ch=str.charAt(0);
      if(str.startsWith("app") && !str.startsWith("apple")){
          //here && is used for removing "app" from any given word which starts with app but not remove app
          //if the word is "apple"//
          new_string(str.substring(3),upd);
      }
      else{
          new_string(str.substring(1),upd+ch);
      }
    }
}
