package recursion;

import java.util.ArrayList;

public class GetMazePathsWithJump {
    public static ArrayList<String> getAllPaths(int sr,int sc,int dr,int dc){

        if(sr==dr && sc==dc){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths=new ArrayList<>();
        for(int hm=1;hm<=dc-sc;hm++){
            ArrayList<String> hPaths=getAllPaths(sr,sc+hm,dr,dc);
            for(String hpath:hPaths){
                paths.add("h"+hm+hpath);
            }
        }

        for(int vm=1;vm<=dr-sr;vm++){
            ArrayList<String> vPaths=getAllPaths(sr+vm,sc,dr,dc);
            for(String vpath:vPaths){
                paths.add("v"+vm+vpath);
            }
        }

        for(int dm=1;dm<=dc-sc && dm<=dr-sr;dm++){
            ArrayList<String> dPaths=getAllPaths(sr+dm,sc+dm,dr,dc);
            for(String dpath:dPaths){
                paths.add("d"+dm+dpath);
            }
        }
        return paths;
    }

    public static void printPaths(int sr,int sc,int dr,int dc,String path){

        if(sr==dr && sc==dc){
            System.out.print(path+" ");
            return;
        }
        for(int ms=1;ms<=dr-sr;ms++) printPaths(sr+ms,sc,dr,dc,path+"v"+ms);

        for(int ms=1;ms<=dc-sc;ms++) printPaths(sr,sc+ms,dr,dc,path+"h"+ms);

        for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++) printPaths(sr+ms,sc+ms,dr,dc,path+"d"+ms);
    }
    public static void main(String[] args) {
        int sr=1,sc=1;
//        System.out.println(getAllPaths(sr,sc,3,3));
        printPaths(1,1,3,3,"");
    }

}
