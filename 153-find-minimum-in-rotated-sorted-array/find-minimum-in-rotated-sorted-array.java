class Solution {
    public int findMin(int[] nums) {
        int ans = nums[0];
        int n = nums.length ;
        int l=0 ;
        int r = n-1 ;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] <= nums[n-1]){
                ans = nums[mid];
                r = mid -1 ;
            }else{
                l = mid+1 ;
            }
        }
        return ans ;


        // int min = Integer.MAX_VALUE ;
        // for(int i=0 ; i<nums.length ; i++){
        //     if(nums[i] < min){
        //         min = nums[i];
        //     }
        // }
        // return min ;
    }
}