class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 1; i <= nums.length; i++) {
            boolean foundInt = false;

            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    foundInt = true;
                    break;
                }
            }

            if(!foundInt) 
            return i;
        }

        return 0;
    }
}