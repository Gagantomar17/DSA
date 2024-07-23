class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length() ;
        if(len<=2) return "" ;
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        int open = 0 ;
        for(int i=1 ; i<len ; i++){
            if(ch[i] == '('){
                open++;
                if(open >0) str.append(ch[i]);
            }else{
                if(open>0) str.append(ch[i]);
                open-- ;
            }
        }
        return str.toString() ; 
    }
}