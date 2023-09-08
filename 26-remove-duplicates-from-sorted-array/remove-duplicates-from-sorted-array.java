import java.util.Scanner ;
class Solution {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 1;
        for(int i=1 ; i<len ; i++){
           if(nums[i] == nums[i-1]){
               continue;
           } else{
               nums[count] = nums[i];
               count++;
           }
        }
        return count;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter "+n+" elements");
        for(int i=0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        int k = removeDuplicates(nums);
        System.out.println(k);

    }
}