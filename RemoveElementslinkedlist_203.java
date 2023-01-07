public ListNode removeElements(ListNode head, int val) {
    if(head == null)
    {
        return head;
    }
    while(head.val == val)
    {
        head = head.next;
        if(head == null)
        {
            return head;
        }
    }
    ListNode temp = head.next;
    ListNode prev = head;
    while(temp!=null)
    {
        if(temp.val == val)
        {
            prev.next = temp.next;
            temp = temp.next;
            continue;
        }
        prev = prev.next;
        temp = temp.next;
    }
    
    return head;
}