
class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int h= -2147483648;
        int k=2147483647;
        long rev = 0;
        if(x<0){
            return false ;
        }
        while(x!=0)
        {
            rev = rev * 10 + x% 10;
            x = x / 10;
        }
        if(rev > k || rev< h) {
            return false ;
        }else{
            return(num == rev);

        }
          
       
        
    }
}