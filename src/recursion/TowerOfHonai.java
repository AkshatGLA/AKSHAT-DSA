package recursion;

import java.util.Scanner;

public class TowerOfHonai {
    public static void towerOfHonai(int n,String t1,String t2,String t3){

        if(n==0) return;
        towerOfHonai(n-1,t1,t3,t2);
        System.out.println(n + "[" + t1 + " -> " + t2 + "]" );
        towerOfHonai(n-1,t3,t2,t1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of dics: ");
        int n=sc.nextInt();
        System.out.print("Enter tower 1: ");
        String t1=sc.next();
        System.out.print("Enter tower 2: ");
        String t2=sc.next();
        System.out.print("Enter tower 3: ");
        String t3=sc.next();

        towerOfHonai(n,t1,t2,t3);

    }
}
