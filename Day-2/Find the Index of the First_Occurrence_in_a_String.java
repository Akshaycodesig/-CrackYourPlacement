class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() > haystack.length())
        {
            return -1;
        }

        int flag = 0;
        int index = 0;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            if(haystack.charAt(i) == needle.charAt(0))
            {   
                boolean temp = true;
                for(int j=i+1,k = 1;k<needle.length();j++,k++)
                {
                    if(haystack.charAt(j) != needle.charAt(k))
                    {
                        temp = false;
                    }
                }

                if(temp == true)
                {
                    return i;
                }
            }
        }

        return -1;
    }
}
