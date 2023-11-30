class Solution {
    static void swap(int[] array ,int i , int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp ;
    }
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for(int i=0 ; i<len-1 ; i++){
            for (int j=i ; j>=0 ; j--){
                if(nums[j]==0){
                    swap(nums , j , j+1);
                }
            }
        }
    }
}