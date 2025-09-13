package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class GetStairsPath {
    public static List<String> allPaths(int n){

        if(n==0){
            List<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }else if(n<0){
            List<String> ans=new ArrayList<>();
            return ans;
        }
        List<String> totalPaths=new ArrayList<>();

        List<String> paths1= allPaths(n-1);
        List<String> paths2= allPaths(n-2);
        List<String> paths3= allPaths(n-3);

        for(String path:paths1) totalPaths.add(path+1);
        for(String path:paths2) totalPaths.add(path+2);
        for(String path:paths3) totalPaths.add(path+3);

        return totalPaths;
    }
    public static void printStairPaths(int n,String path){

        if(n==0){
            System.out.print(path+" ");
            return;
        }else if(n<0) return;
        printStairPaths(n-1,path+1);
        printStairPaths(n-2,path+2);
        printStairPaths(n-3,path+3);
    }
    public static void main(String[] args) {
//        System.out.println(allPaths(4));
        System.out.println(allPaths(4));
        printStairPaths(4,"");

    }

}
