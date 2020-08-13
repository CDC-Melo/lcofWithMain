public class ReverseWords
{
    public String reverseWords(String s)
    {
        s = s.trim();
        int i = s.length() - 1;
        int j = i;
        StringBuilder sb = new StringBuilder();
        while(i >= 0)
        {
            while(i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i+1,j+1)+" ");
            while(i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        String str = new String("the sky is blue");
        System.out.println(new ReverseWords().reverseWords(str));
    }
}
