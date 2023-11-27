class Solution {
    public int findDuplicate(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        for(int i=1 ; i<l ; i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }

        }
        return 0 ;
    }
}