import java.util.Scanner;
class Solution {
    public static int maxArea(int[] height) {
        int length , breadth ;
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while(left<right){
            length = (height[left] < height[right]) ? height[left] : height[right] ;
            breadth = right - left ;
            int temp = length * breadth ;
            if(temp > area ){
                area = temp;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.println("Enter "+ n + " elements");
        for(int i=0 ; i<n ; i++){
            height[i] = sc.nextInt();
        }
        int areaMax = maxArea(height);
        System.out.println("Max amount of water that the container can store : " + areaMax);
    }
}