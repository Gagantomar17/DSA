class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1 ;
        if(nums.length ==1){
            int i =(target <= nums[0])? 0 : 1 ;
            return i;
        }
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid ;
            }else if(target < nums[mid]){
                if(mid == 0){
                    return mid ;
                }else if(target > nums[mid-1]){
                    return mid ;
                }
                r = mid -1 ;
            }else{ // target > nums[mid]
                if(mid == nums.length-1 ){
                    return mid+1 ;
                }else if(target < nums[mid+1]){
                    return mid+1;
                }
                l = mid + 1 ;
            }
        }
        return -1 ;
    }
}