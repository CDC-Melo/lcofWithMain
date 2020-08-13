import java.util.HashMap;

public class FirstUniqueChar
{
    public char firstUniqueChar(String s)
    {
        HashMap<Character,Boolean> map = new HashMap<>();
        char[] str = s.toCharArray();
        for(char c : str)
            map.put(c,!map.containsKey(c));
        for(char c : str)
        {
            if(map.get(c)) return c;
        }
        return ' ';
    }

    public static void main(String[] args)
    {
        String s = new String("abaccdeff");
        System.out.println(new FirstUniqueChar().firstUniqueChar(s));
    }
}
