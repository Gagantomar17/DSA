class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long firstMax = Long.MIN_VALUE  ;
        for(int i=0 ; i<n ; i++){
            if(nums[i]>firstMax){
                firstMax = nums[i];
            }
        }
        long secondMax = Long.MIN_VALUE ;
        for(int i=0 ; i<n ; i++){
            if(nums[i] != firstMax && nums[i]>secondMax){
                secondMax = nums[i];
            }
        }
        long thirdMax = Long.MIN_VALUE ;
        for(int i=0 ; i<n ; i++){
            if(nums[i] != firstMax && nums[i] != secondMax && nums[i]>thirdMax){
                thirdMax = nums[i];
            }
        }
        if(thirdMax == Long.MIN_VALUE){
            thirdMax = firstMax ;
        }
        return (int)thirdMax ;
    }
}