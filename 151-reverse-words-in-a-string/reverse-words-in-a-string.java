class Solution {
    public String reverseWords(String s) {
        String ans = "";
        StringBuilder temp = new StringBuilder("");
        for(int i=s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                temp.append(ch);
            }else{
                if(temp.length()>0){
                    ans += temp.reverse();
                    ans += " ";
                    temp.delete(0 , temp.length() );
                }
            }
        }
        ans += temp.reverse();
        return ans.trim() ;
    }
}