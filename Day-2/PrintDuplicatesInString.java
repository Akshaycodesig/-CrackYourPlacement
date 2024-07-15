package Playground;

import java.util.HashMap;

public class Sample {

    public static void main(String[] args)
    {   
        String str = "geeksforgeeks";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {   
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),1);
            }
            else
            {   
                int temp = map.get(str.charAt(i));
                map.put(str.charAt(i),++temp);
            }
        }

        for(int i=0;i<str.length();i++)
        {   
            if(map.containsKey(str.charAt(i)))
            {
                if(map.get(str.charAt(i)) > 1)
                {
                    System.out.println(str.charAt(i)+" Count is "+map.get(str.charAt(i)));
                    map.remove(str.charAt(i));
                }
            }
        }

        


        
        

    }

}
