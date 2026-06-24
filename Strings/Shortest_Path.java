package Strings;

public class Shortest_Path {
    public static double finding_path(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        double shortest=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return shortest;
        
    }
    
    public static void main(String args[]){
        System.out.println(finding_path("WNEENESENNN"));

    }
}
