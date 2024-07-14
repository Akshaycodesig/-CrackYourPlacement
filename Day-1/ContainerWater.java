class Solution {
    public int maxArea(int[] height) {
        
        int lp = 0;
        int rp = height.length-1;

        int max = 0;
        while(lp < rp)
        {   
            int lph = height[lp];
            int rph = height[rp];

            int water = Math.min(lph,rph) * (rp-lp);

            max = Math.max(max,water);
            
            if(lph < rph)
                lp++;
            else
                rp--;
        }

        return max;
    }
}
