public class palindrome_string {
    public static void main(String args[]) {
        String  name="raceecar";
        int n=name.length();
        int count=0;
       for(int i=0;i<name.length()/2;i++){
           if(name.charAt(i)==name.charAt(n-i-1)){
               count++;
           }
           else{
               System.out.println("This is not a palindrome word");
               break;
           }
       }
       if(count==name.length()/2){
           System.out.println("This is a palindrome word");
       }
    }
}
