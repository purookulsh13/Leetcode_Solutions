 public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        boolean res = false;
        ListNode temp = head;
        while(temp!=null){
            s.push(temp.val);
            temp = temp.next;
        }
        temp=head;
        while(temp!=null){
            int i = s.pop();
            if(temp.val==i)
                res = true;
            else{
                res = false;
                break;
            }
            temp = temp.next;
        }

        return res;


}