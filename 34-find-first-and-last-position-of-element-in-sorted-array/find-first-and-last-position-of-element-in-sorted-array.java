class Solution {
    public int[] searchRange(int[] nums, int target) {
        int range[] = {-1,-1};
        int l=0 ;
        int r=nums.length-1;
        if(nums.length == 1){
            int n = (target == nums[0])? 0 : -1 ;
            range[0] = range[1] = n ;
            return range ;
        }
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]==target){
                range[0] = range[1] = mid ;
                int n = mid ;
                int m = mid ;
                while(n>0 && nums[--n] == target){
                    range[0] = n ;
                }
                while(m<nums.length-1 && nums[++m] == target){
                    range[1] = m ;
                }
                return range ;
            }else if(target < nums[mid]){
                r = mid-1 ;
            }else{
                l = mid+1;
            }
        }
        return range ;
        
    }
}