import org.w3c.dom.ls.LSOutput;

public class togglecharacter {
    public static class Toggle{
        String str;
        public Toggle(StringBuilder s){
            String st="";
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    st+=Character.toUpperCase(s.charAt(i));
                }else{
                    st+=Character.toLowerCase(s.charAt(i));
                }
            }
            this.str=st;
        }
    }

    public static void main(String[] args) {
      Toggle tg=new Toggle(new StringBuilder("ArYaNi"));
        System.out.println(tg.str);
    }
}
