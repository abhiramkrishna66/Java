class Solution {
    public boolean isPalindrome(int x) {
   int rev=0;
   int rem=0;
   int num=x;
   if(x<0){
    return false;
   }     
   while(num!=0){
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
   }
   if(rev==x){
    return true;
   }
   else{
    return false;
   }
    }
}
