import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[(int)nums.length/2];

    }
}

// Using HashMap
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {   
                int temp = map.get(nums[i]) + 1;
                map.put(nums[i],temp);
            }
        }

        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i]) > (int)nums.length/2)
                max = nums[i];
        }

        return max;
    }
}
