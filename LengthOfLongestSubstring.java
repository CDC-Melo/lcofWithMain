import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring
{
    public int lengthOfLongestSubstring(String s)
    {
        Map<Character,Integer> dic = new HashMap<>();
        int res = 0;
        int temp = 0;
        for(int i = 0;i < s.length();i++)
        {
            int j = dic.getOrDefault(s.charAt(i),-1);
            dic.put(s.charAt(i),i);
            temp = temp < i-j ? temp+1 : i-j;
            res = Math.max(temp,res);
        }
        return res;
    }

    public static void main(String[] args)
    {
        String s = new String("abcabcbb");
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }
}
