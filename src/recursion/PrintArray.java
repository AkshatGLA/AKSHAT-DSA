package recursion;

public class PrintArray {
    public static  void displayArr(int arr[],int idx){
        if(idx>=arr.length) return;
        System.out.print(arr[idx]+" ");
        displayArr(arr,idx+1);
    }
    public static  void displayArrRev(int arr[],int idx){
        if(idx==arr.length) return;
        displayArrRev(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        displayArr(arr,0);
        System.out.println();
        displayArrRev(arr,0);
    }
}
