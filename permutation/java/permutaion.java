//Printing the all the possible permutations (subsequences) of a given string//
package permutation.java;
public class permutaion {
    public static void main(String[] args) {
        perm("","abc");
    }
    static void perm(String p,String up){
          if(up.isEmpty()){
              System.out.println(p);
              return;
          }
          char ch=up.charAt(0);
          for(int i=0;i<=p.length();i++){
              String left=p.substring(0,i);
              String right=p.substring(i,p.length());
       perm(left+ch+right,up.substring(1));
          }
    }
}
