import java.util.Scanner ;
class Solution {
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                return true ;
            }
        }
        
        return false ;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of n array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter "+n+" Elements ");
        for(int i=0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate( nums));

    }
}