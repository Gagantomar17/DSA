class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merge[] = new int[m+n];
        int len = merge.length;
        int i=0 , j=0 , k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merge[k++]=nums1[i++];
            }else{
                merge[k++]=nums2[j++];
            }
        }
        while(i<m){
            merge[k++] =  nums1[i++];
        }
        while(j<n){
            merge[k++] = nums2[j++];
        }
        for(int a=0 ; a<len ; a++){
            nums1[a] = merge[a];
        }
    }
}