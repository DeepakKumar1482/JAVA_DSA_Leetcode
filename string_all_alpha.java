public class string_all_alpha {
    public static void main(String args[]){
        String sen="jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausa" +
                "xxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovc" +
                "ucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksy" +
                "uztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(sen.charAt(3));
        boolean ans=checkIfPangram(sen);
        System.out.println(ans);
    }
    static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        for(int i=97;i<=122;i++)  {
            int count=0;
            int j=0;
                while(j<sentence.length() ){
                    if((char)i==sentence.charAt(j)){
                        count = 1;
                        break;
                    }
                    j=j+1;
                }
                if(count==0){
                    return false;
                }
            }
        return true;
    }
}
