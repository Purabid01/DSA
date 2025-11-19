class Solution {
    public int reverse(int x) {
      int rev_dig = 0;

      while(x != 0) 
      {
        int rem = x % 10;

        if (rev_dig > Integer.MAX_VALUE / 10 || 
                rev_dig < Integer.MIN_VALUE / 10) {
                return 0;
            }


        rev_dig = (rev_dig * 10) + rem;
        x = x/10;
    }

    return rev_dig;
    }
}