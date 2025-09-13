package recursion;

import java.util.ArrayList;

public class GetMazePaths {
    public static ArrayList<String> getPaths(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths=new ArrayList<>();
        ArrayList<String> vpaths=new ArrayList<>();
        if(sc<dc){
            hpaths=getPaths(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vpaths=getPaths(sr+1,sc,dr,dc);
        }
        ArrayList<String> ans=new ArrayList<>();
        for(String h:hpaths){
            ans.add("h"+h);
        }
        for(String v:vpaths){
            ans.add("v"+v);
        }
        return ans;
    }
    public static void printPath(int sr,int sc,int dr,int dc,String path){
        if(sr>dr || sc>dc) return;
        if(sr==dr && sc==dc){
            System.out.print(path+" ");
            return;
        }
        printPath(sc+1,sr,dr,dc,path+"h");
        printPath(sc,sr+1,dr,dc,path+"v");

    }
    public static void main(String[] args) {
//        ArrayList<String> ans=getPaths(1,1,3,2);
//        System.out.println(ans.size());
//        System.out.println(ans);
        printPath(1,1,3,3,"");
    }
}
