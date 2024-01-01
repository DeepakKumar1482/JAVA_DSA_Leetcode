public class leetcode12 {
    public static void main(String[] args) {
        int a=2421;
        System.out.println(intToRoman(a));
    }
//    Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
    public static String  intToRoman(int num) {
        String ans="";
//        while(num>0){
        if(num/1000>0 || num>=900){
            if(num/1000>0){
                int d=num/1000;
                while(d>0){
                    ans=ans+"M";
                    d--;
                }
            }
//                int div=num/1000;
            num=num%1000;
            if(num>=900){
                ans=ans+"CM";
                num=num-900;
            }
        }
        if(num/500>0 || num>=400){
            if(num/500>0) {
                int d=num/500;
                while(d>0){
                    ans = ans + "D";
                    d--;
                }
            }
//                int di
            num=num%500;
            if(num>=400){
                ans=ans+"CD";
                num=num-400;
            }
        }
        if(num/100>0 || num>=90){
            if(num/100>0) {
                int d=num/100;
                while(d>0){
                    ans = ans + "C";
                    d--;
                }
            }
            num=num%100;
            if(num>=90){
                ans=ans+"XC";
                num=num-90;
            }
        }
        if(num/50>0 || num>=40){
            if(num/50>0) {
                int d=num/50;
                while(d>0){
                    ans = ans + "L";
                    d--;
                }
            }
            num=num%50;
            if(num>=40){
                ans=ans+"XL";
                num=num-40;
            }
        }
        if(num/10>0 || num==9){
            if(num/10>0 ) {
                int d=num/10;
                while(d>0){
                    ans=ans+"X";
                    d--;
                }
                while(d>0){
                    ans = ans + "X";
                    d--;
                }
            }
            num=num%10;
            if(num==9){
                ans=ans+"IX";
                num=num-9;
            }
        }
        if(num/5>0 || num==4){
            if(num/5>0) {
                int d=num/5;
                while(d>0){
                    ans = ans + "V";
                    d--;
                }
            }
            num=num%5;
            if(num==4){
                ans=ans+"IV";
                num=num-4;
            }
        }
        if(num<4){
            for(int i=0;i<num;i++){
                ans=ans+"I";
            }
        }
//        }
//        System.out.println( ans);
        return ans;
    }
}
