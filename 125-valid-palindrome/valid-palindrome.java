class Solution {
    public boolean isPalindrome(String s) {
        //s.toLowerCase();
        int n = s.length();
        int i=0 ;
        int j=n-1 ;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else{
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false ;
                }
                i++;
                j--;
            }
        }
        return true ;
    }
}