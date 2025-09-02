package bridgeLab;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>=90){
            System.out.println("GRADE A");
        }
        if(n>75 && n<=89){
            System.out.println("GRADE B");
        }
        if(n>=50 && n<74){
            System.out.println("GRADE C");
        }
    }
}
