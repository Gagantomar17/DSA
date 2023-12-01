class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int sum = (n*(n+1))/2;
        for(int j=0 ; j<n ; j++){
            sum-=nums[j];
        }
        return sum;
        
    }
}