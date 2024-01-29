import java.util.*;
public class Practice {
    public static void main(String[] args) {
        List<List<String >>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            List<String> l = new ArrayList<>();
            for(int j=0;j<2;j++) {
                String str = sc.nextLine();
                l.add(str);
            }
            list.add(l);
        }
        for(int i=0;i<4;i++){
            System.out.println(list.get(i));
        }
        String s="add";
//        if(s=="add"){
//            System.out.println("hhhhhhhhhhhh");
//        }
        System.out.println(contacts(list));
    }
    public static List<Integer> contacts(List<List<String>> queries) {
        List<Integer>list=new ArrayList();
        List<String>sl=new ArrayList();
        for(int i=0;i<queries.size();i++){
            for(int j=0;j<queries.get(i).size()-1;j++){
                System.out.println(queries.get(i).get(j));
                if(queries.get(i).get(j).equals("add")){
                    sl.add(queries.get(i).get(1));
                }else{
                    int count=0;
                    for(int k=0;k<sl.size();k++){
                        String str=sl.get(k);
                        String com=queries.get(i).get(1);
                        String sub=str.substring(0,com.length());
                        if(sub.equals(com)){
                            count++;
                        }
                    }
                    list.add(count);
                }
            }
        }
        return list;
    }

}
