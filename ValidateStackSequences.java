import java.util.Stack;

public class ValidateStackSequences
{
    public boolean validateStackSequences(int[] pushed,int[] popped)
    {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : pushed)
        {
            stack.push(num);

            while(!stack.isEmpty() && stack.peek() == popped[i])
            {
                stack.pop();
                i++;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        int[] pushed = new int[]{1,2,3,4,5};
        int[] popped = new int[]{4,5,3,2,1};
        System.out.println(new ValidateStackSequences().validateStackSequences(pushed,popped));
    }
}
