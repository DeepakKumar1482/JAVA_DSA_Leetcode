package substring_string_questions.java;

import java.util.ArrayList;
import java.util.List;
public class subsets_of_array {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>>ans=subsets(arr);
        for(List<Integer>list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subsets(int arr[]){
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
               int size=outer.size();
            System.out.println("size"+size);
               for(int i=0;i<size;i++){
                   List<Integer>internal=new ArrayList<>(outer.get(i));
                   System.out.println("get"+outer.get(i));
                   internal.add(num);
                   System.out.println("internal"+internal);
                   System.out.println("size_inter"+internal.size());
                   outer.add(internal);
            }
        }
        return outer;
    }
}
