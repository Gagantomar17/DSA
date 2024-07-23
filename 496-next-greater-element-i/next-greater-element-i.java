class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>() ;
        for(int i=0 ; i<nums1.length ; i++){
            for(int j=0 ; j<nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    int k = j+1 ;
                    while(k<nums2.length && st.isEmpty()){
                        if(nums2[j] < nums2[k]){
                            st.push(nums2[k]) ;
                        }else{
                            k++ ;
                        }
                    }
                    if(st.isEmpty()){
                        ans[i] = -1 ;
                    }else{
                        ans[i] = nums2[k] ; 
                        st.pop() ;
                    }
                }
            }
        }
        return ans ;
    }
}