class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }else{
                if(st.peek() == s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
            
        }

        while(!st.isEmpty()){
            ans.append(st.pop()) ;
        }
        ans.reverse() ;

        return ans.toString() ;
    }
}