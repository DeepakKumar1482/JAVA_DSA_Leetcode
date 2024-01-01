package leetcode2352;

import java.util.HashMap;
//[11  1]
//[1   11]
public class java {
    public static void main(String[] args) {
        int arr[][]={{13,13},{13,13}};
        System.out.println(equalPairs(arr));
    }
    public static int equalPairs(int [][]grid){
        int ans=0;
        HashMap<Integer,String >rowmap=new HashMap<>();
        HashMap<Integer,String>colmap=new HashMap<>();
        HashMap<Integer,String>map=new HashMap<>();
        int l=0;
        for(int i=0;i<grid.length;i++){
            String rownum="";
            String colnum="";
            int values=0;
            for(int j=0;j<grid[0].length;j++){
                rownum=rownum+Integer.toString(grid[i][j])+"-";
                colnum=colnum+Integer.toString(grid[j][i])+"-";
            }
            l++;
           map.put(l,rownum);
            l++;
            map.put(l,colnum);
            rowmap.put(i,rownum);
            colmap.put(i,colnum);
        }
        System.out.println(map);
        for (String a:map.values()) {
            if(rowmap.containsValue(a) && colmap.containsValue(a)){
                ans++;
            }
        }

//        for(int i=0;i<grid.length;i++){
//            String colnum="";
//            for(int j=0;j<grid[0].length;j++){
//                colnum=colnum+grid[j][i]+"-";
//            }
//            colmap.put(i,colnum);
//        }


//        for (String a: rowmap.values()) {
//            for (String b: colmap.values()) {
//                System.out.println("a="+a  +"b="+b);
//                if(a.equals(b)){
//                    ans++;
//                }
//            }
//        }

        return ans;
    }
}
