class Solution {
    public int reverse(int x) {
        System.out.println(Integer.MAX_VALUE);
        int num=x;
        int rev =0;
        int rem =0;
        while(num!=0){
            rem = num%10;
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE && rem<-8)){
                return 0;
            }if(rev>Integer.MAX_VALUE/10 ||(rev==Integer.MAX_VALUE && rem>7)){
                return 0;
            }
            rev = rev*10 + rem;
            num = num/10;
        }
        if(x<0){
            //return -1*rev;
        }
        return rev;
    }
}