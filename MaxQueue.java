import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue
{
    Queue<Integer> queue;
    Deque<Integer> help;
    public MaxQueue()
    {
        queue = new LinkedList<>();
        help = new LinkedList<>();
    }

    public int max_value()
    {
        if(help.isEmpty()) return -1;
        return help.peekFirst();
    }

    public int pop_front()
    {
        if(queue.isEmpty()) return -1;
        int e = queue.remove();
        if(e == help.peekFirst())
            help.remove();
        return e;
    }

    public void push_back(int num)
    {
        queue.offer(num);
        while(!help.isEmpty() && num > help.peekLast())
            help.removeLast();
        help.addLast(num);
    }

    public static void main(String[] args)
    {
        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(5);
        maxQueue.push_back(1);
        maxQueue.push_back(3);
        System.out.println(maxQueue.max_value());
        System.out.println(maxQueue.pop_front());
        System.out.println(maxQueue.max_value());
    }

}
