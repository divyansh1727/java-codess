package linkedlist;

import static java.util.Collections.reverse;

//q4.cycle present??
public class cycleleet {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    //reverse

    //q5.length of cycle
    public int lengthCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp=slow;
                int lenght=0;
                do{
                    temp= temp.next;
                    lenght++;
                }while(temp!=slow);
                return lenght;
            }
        }
        return 0;
    }

        public ListNode detectCycle(ListNode head) {
        int length=0;
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    length=lengthCycle(slow);
                    break;
                }
            }
            if(length==0){
                return null;
            }
           //find start
            ListNode f=head;
            ListNode s=head;
            while(length>0){
                s=s.next;
                length--;
        }
            //keep moving both forward
            while(f!=s){
                f=s.next;
                s=s.next;

            }
            return s;
    }
    //happy number
    public boolean ishappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow= findSquare(slow);
            fast= findSquare(findSquare(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return  false;

    }
    private int findSquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number/=10;

        }
        return ans;

    }

    //middle of ll
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;

    }
    //sort ll

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headsecond=reverse(mid);
        ListNode revhead=headsecond;
        while(head!=null && headsecond!=null){
            if(head.val !=headsecond.val){
                break;
            }
            head=head.next;
            headsecond=headsecond.next;

        }
        reverse(revhead);
        return head==null && headsecond==null;

    }

    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;
        //rearrange
        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        //setting of next of tail to null
        if(hf!=null){
            hf.next=null;
        }



    }
}


class ListNode{
    int val;
    ListNode next;
}

