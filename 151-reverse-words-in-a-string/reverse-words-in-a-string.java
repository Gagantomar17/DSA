class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        String[] str = s.split("\\s+");
        for(int i=str.length -1 ; i>=0 ; i--){
            ans.append(str[i]).append(" ");
        }
        return ans.toString().trim();
    }
}