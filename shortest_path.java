public class shortest_path {
    public static void main(String args[]) {
        String dir = "WNEENESENNN";
        int ans=shortpath(dir);
        System.out.println(ans);
    }
    static int shortpath(String direction){
        int x=0,y=0;
        for(int i=0;i<direction.length();i++) {
            if (direction.charAt(i)=='W'){
                x--;
            } else if (direction.charAt(i)=='N') {
                y++;
            }
            else if(direction.charAt(i)=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        return (int) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}
