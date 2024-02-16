class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] str = s.split("\\s+");
        for(int i=str.length -1 ; i>=0 ; i--){
            ans += str[i] + " "; 
        }
        return ans.trim() ;
    }
}