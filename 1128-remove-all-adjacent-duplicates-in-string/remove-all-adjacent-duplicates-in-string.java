class Solution {
    public String removeDuplicates(String s) {

        char[] arr = new char[s.length()];
        int idx = -1 ;
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i) ;
            if( idx == -1 || arr[idx] != c){
                arr[idx+1] = c  ;
                idx++ ; 
            }else{
                idx-- ;
            }
        }
        String ans = new String(arr , 0 , idx+1);
        return ans ; 
        






        // Stack<Character> st = new Stack<>();
        // StringBuilder ans = new StringBuilder();
        // for(int i=0 ; i<s.length() ; i++){
        //     if(st.isEmpty()){
        //         st.push(s.charAt(i));
        //     }else{
        //         if(st.peek() == s.charAt(i)){
        //             st.pop();
        //         }else{
        //             st.push(s.charAt(i));
        //         }
        //     }
            
        // }

        // while(!st.isEmpty()){
        //     ans.append(st.pop()) ;
        // }
        // ans.reverse() ;

        // return ans.toString() ;
    }
}