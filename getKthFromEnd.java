import java.util.List;

public class getKthFromEnd
{
    public int getNum(ListNode head,int k)
    {
        ListNode fommer = head;
        ListNode latter = head;
        for(int i = 0;i < k;i++)
            fommer = fommer.next;

        while(fommer != null)
        {
            fommer = fommer.next;
            latter = latter.next;
        }
        return latter.val;
    }

    public static void main(String[] args)
    {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        System.out.println(new getKthFromEnd().getNum(node1,3));
    }
}

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}
