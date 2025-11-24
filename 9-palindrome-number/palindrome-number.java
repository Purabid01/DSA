class Solution {
    public boolean isPalindrome(int x) {
        int dupNum = x;
        int revNum = 0;
        boolean isPalin =true;

        if(x < 0 )
            return false;

        while(dupNum != 0) {
            int q = dupNum/10;
            int rem = dupNum % 10;
             revNum = (revNum * 10) + rem;
            dupNum = dupNum / 10;
         }

         if(revNum == x) {
          return isPalin;
         }

         return false; 
    }
}