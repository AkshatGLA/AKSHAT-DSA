package bridgeLab;

public class Diamond {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
//        n=n-1;
        for(int i=0;i<n;i++){
            System.out.print(" ");
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            for(int k=n-i-1;k>0;k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
