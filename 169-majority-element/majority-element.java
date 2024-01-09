class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length ;
        int m = n/2 ;
        int maj = nums[0];
        for(int i=0 ; i<n ; i++){
            int count = 1;
            for(int j = i+1 ; j<n ; j++ ){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>m){
                maj = nums[i];
                break ;
            }     
        }
        return maj;
    }
   
}