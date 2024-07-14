class Solution {
    public void moveZeroes(int[] nums) {
        int L = 0;
        int R = 1;

        while(R < nums.length)
        {
            if(nums[R] != 0)
            {
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;

                L++;
                R++;
            }
            else
                R++;
        }
    }
}
