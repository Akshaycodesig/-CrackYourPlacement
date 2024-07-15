class Solution {

    public static boolean CheckPali(String s, int n)
    {   
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(n);

        String temp1 = sb.toString();
        String temp = sb.reverse().toString();
        return temp.equals(temp1);
        

        
    }
    public boolean validPalindrome(String s) {
        
        int lp = 0;
        int rp = s.length()-1;


        while(lp < rp)
        {
            if(s.charAt(lp) != s.charAt(rp))
            {
                if(CheckPali(s, lp) == true || CheckPali(s, rp) == true)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
            lp++;
            rp--;

        }

        return true;




    }
}
