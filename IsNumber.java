public class IsNumber
{
    public boolean isNumber(String s)
    {
        s = s.trim();
        if(s.length() == 0)
            return false;

        boolean dotSeen = false;
        boolean numSeen = false;
        boolean eSeen = false;
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                numSeen = true;
            else if(s.charAt(i) == '.')
            {
                if(eSeen || dotSeen)
                    return false;
                dotSeen = true;
            }
            else if(s.charAt(i) == 'e' || s.charAt(i) == 'E')
            {
                if(eSeen || !numSeen)
                    return false;
                eSeen = true;
                numSeen = false;
            }
            else if(s.charAt(i) == '-' || s.charAt(i) == '+')
            {
                if(i !=0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')
                    return false;
            }
            else return false;
        }
        return numSeen;
    }

    public static void main(String[] args)
    {
        String s1 = new String("0123");
        String s2 = new String("1.2.3");
        System.out.println(new IsNumber().isNumber(s1));
        System.out.println(new IsNumber().isNumber(s2));
    }
}
