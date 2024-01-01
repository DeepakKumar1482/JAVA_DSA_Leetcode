package Tutioln.date18;

import java.util.Stack;
//array => {1,4,2,7,5};
//faboaccie seriees
//merge sort
//selection sort
public class leetcodeeasy {
    public static void main(String[] args) {
        System.out.println(An("0","1"));
    }
    public static String An(String a, String b){
        int num1=Integer.parseInt(a);
        int num2=Integer.parseInt(b);
        int carry=0;
        int sum=0;
        String ans="";
        if(num1<2 || num2<2 ){
//            sum=Integer.toString(num1)+Integer.toString(num2)
            ans+=Integer.toString(num1);
        }
        if (num2==0){
            ans+=Integer.toString(num2);
        }
        while(num1>0 && num2>0){
            int rem1=num1%10;
            int rem2=num2%10;
            num1=num1/10;
            num2=num2/10;
             sum=rem1+rem2+carry;
            if(sum>1 ){
                ans=ans+Integer.toString(0);
                carry=1;
            }
            else{
                ans=ans+Integer.toString(sum);
            }
        }
        while(num1>0){
            int rem1=num1%10+carry;
            if(rem1>1){
                ans=ans+Integer.toString(0);
                carry=1;
            }
            else {
                ans=ans+Integer.toString(rem1);
            }
            num1=num1/10;
        }
        while(num2>0){
            int rem1=num2%10+carry;
            if(rem1>1){
                ans=ans+Integer.toString(0);
                carry=1;
            }
            else {
                ans=ans+Integer.toString(rem1);
            }
            num2=num2/10;
        }
        ans+=Integer.toString(carry);
        String answer="";
        for (int i=ans.length()-1;i>=0;i--){
            answer=answer+ans.charAt(i);
        }
        return answer;
            }
}
