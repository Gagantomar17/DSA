class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length ;
        int l=0 ;
        int r=n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid ;
            }else if(nums[mid]<= nums[n-1]){
                if(target > nums[mid] && target <= nums[n-1]){
                    l = mid+1 ;
                }else{
                    r = mid-1;
                }
            }else{ // nums[l] <= nums[mid]
                if(target >=nums[l] && target <nums[mid]){
                    r = mid-1 ;
                }else{
                    l  = mid+1 ;
                }
            }
        }
        return -1;
    }
}