class Solution {
    public int removeDuplicates(int[] nums) {
        
        int curr_ele = nums[0];
        int index = 1;

        int unq_ele = 1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != curr_ele)
            {
                nums[index] = nums[i];
                curr_ele = nums[i];

                unq_ele++;
                index++;
            }
        }

        return unq_ele;
    }
}
