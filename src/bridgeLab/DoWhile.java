package bridgeLab;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        int i=0;
//        do{
//            System.out.println("akshat");
//            i++;
//        }while (i<10);

        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
        int n=1;

        while(n!=0){
            System.out.println("Enter the number: ");
            n=sc.nextInt();
        }
        System.out.println("Thanks you entered zero");
    }

}
