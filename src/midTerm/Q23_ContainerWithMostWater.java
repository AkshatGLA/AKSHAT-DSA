package midTerm;

public class Q23_ContainerWithMostWater {
    public static int maxArea(int[] height){
        int left=0,right=height.length-1;
        int max=0,min=0;
        while(left<=right){
            int len=right-left;
            min=Math.min(height[left],height[right]);
            max=Math.max(max,(min*len));
            if(height[left]>=height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
