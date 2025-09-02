import java.util.ArrayList;
import java.util.Scanner;

public class SumOfZeros {
    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
        int count=0;
        int m=mat.size();
        int n=mat.get(0).size();

        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if((mat.get(i).get(j)==0)&& (mat.get(i).get(j+1)==1)){
                    count++;
                }if((mat.get(i).get(j)==0)&& (mat.get(i+1).get(j)==1)){
                    count++;
                }
                if((mat.get(i).get(j)==0)&& (mat.get(i).get(j-1)==1)){
                    count++;
                }if((mat.get(i).get(j)==0)&& (mat.get(i-1).get(j)==1)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int m=sc.nextInt();
        System.out.print("Enter the columns: ");
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> helper=new ArrayList<>();
            for(int j=0;j<n;j++){
                System.out.print("Enter the element: ");
                int elm=sc.nextInt();
                helper.add(elm);
            }
            list.add(helper);
        }
        for(int i=0;i<m;i++){
            System.out.println(list.get(i));
        }

        System.out.println(coverageOfMatrix(list));
    }
}
