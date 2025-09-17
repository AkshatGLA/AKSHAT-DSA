package backtracking;

import java.util.Scanner;
import java.util.*;
public class PrintAbbreviations {
    public static void sol(String str, String asf, int count, int pos, ArrayList<String> ans) {
        if (pos == str.length()) {
            if (count == 0) ans.add(asf);
            else ans.add(asf + count);
            return;
        }
        if (count > 0)
            sol(str, asf + count + str.charAt(pos), 0, pos + 1, ans);
        else
            sol(str, asf + str.charAt(pos), 0, pos + 1, ans);

        sol(str, asf, count + 1, pos + 1, ans);
    }

    public static ArrayList<String> findAbbr(String str) {
        ArrayList<String> ans = new ArrayList<>();
        sol(str, "", 0, 0, ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//        solution(str,"",0,0);
        ArrayList<String> ans = new ArrayList<>();
        sol(str,"",0,0,ans);
        Collections.sort(ans);
        System.out.println(ans);

//        System.out.println(ans);
    }
}
