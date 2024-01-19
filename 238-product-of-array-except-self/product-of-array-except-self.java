class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int result[] = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
        // int n = nums.length ;
        // int[] preProduct = Arrays.copyOf(nums , n);
        // int[] posProduct = Arrays.copyOf(nums , n);
        // for(int i=1 ; i<n ; i++){
        //     preProduct[i] = preProduct[i]*preProduct[i-1];
        // }
        // for(int i=n-2 ; i>=0 ; i--){
        //     posProduct[i] *= posProduct[i+1];
        // }

        // for(int i=0 ; i<n ; i++){
        //     if(i==0){
        //         nums[i] = posProduct[i+1];
        //     }else if(i==n-1){
        //         nums[i] = preProduct[i-1];
        //     }else{
        //         nums[i] = preProduct[i-1]*posProduct[i+1];
        //     }
        // }
        // return nums;
    }
}