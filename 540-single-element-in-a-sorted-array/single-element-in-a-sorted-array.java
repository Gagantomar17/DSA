class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int l=0 ;
        int r=nums.length-1;
        while(l<=r){
            if(nums[l] == nums[l+1] && nums[r] == nums[r-1] ){
                l +=2 ;
                r -=2 ;
            }else{
                return nums[l] != nums[l+1] ? nums[l] : nums[r] ;
            }

        }
        return 0 ;
    }
}