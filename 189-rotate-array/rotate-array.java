class Solution {

    static void swap(int[] array , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static void rev(int[] array , int i , int j){
        while(i<j){
            swap(array , i , j);
            i++;
            j--;
        
        }
    }

    public void rotate(int[] nums, int k){
        int l = nums.length ;
        k = k%l;
        rev(nums , 0 , l-1);
        rev(nums , 0 , k-1);
        rev(nums , k , l-1);
        
    }
}