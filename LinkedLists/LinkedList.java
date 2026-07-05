package LinkedLists;
public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int count;
        public void addFirst(int data){
            // Create newNode
            Node newNode=new Node(data);
            count++;
            // If LinkedList is nul
            if(head==null){
                head=tail=newNode;
                return;
            }
            //step2 - newNode next =null;
            newNode.next=head;
            // step3 - head=newNode
            head=newNode;
        }



        //     O(n)



        // public void addLast(int data,Node head){
        //     Node newNode=new Node(data);
        //     if(head==null){
        //         head=tail=newNode;
        //         return ;
        //     }
        //     Node temp=head;
        //     while(temp.next!=null){
        //         temp=temp.next;
        //     }
        //     temp.next=newNode;
        // }



        //   O(1)

        public void addLast(int data){
            Node newNode = new Node(data);
            count++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void printList(){
            if(head==null){
                System.out.println("Linked list is empty..");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");

        }

        public void addAtMiddle(int data,int index){
           
            if(index==0){
                addFirst(data);
                return;
            }
             Node newNode=new Node(data);
             count++;
            

            
            int i=0;
            Node temp=head;
            while(i!=index-1){
                temp=temp.next;
                i++;

            }
            
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public void reverse(){
            Node prev=null ;
            Node curr=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            head=prev;
            
        }
        public int  removeFirst(){
            if(head==null){// or count==0
                System.out.println("Linked List is Empty");
                return Integer.MIN_VALUE;
            }else if(head==tail){  // count==1
                int val=head.data;
                head=tail=null;
                count=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            count--;
            return val;
        }
        public int removeLast(){
            if(count==0){
                System.out.println("Linked list is empty");
                return Integer.MIN_VALUE;
            }else if(count==1){
                int val=head.data;
                head=tail=null;
                count--;
                return val;
            }
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            int val=tail.data;
            tail=temp;
            tail.next=null;
            count--;
            return val;
            
        }
        public int itrSearch(int key){
            Node temp=head ;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                i++;
                temp=temp.next;
                

            }
            return -1;
        }
        public int helper(int key,Node head){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(key,head.next);
            if(idx==-1){
                return -1;
            }
            return idx+1;

        }
        public int recSearch(int key){
            return helper(key,head);
        }
        public Boolean pallindrome(){
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            if(head==null){
                return true;
            }
            if(head.next==null){
                return true;
            }
            
            Node prev=null;
            Node Next;
            Node temp=slow;
            while(temp!=null){
                Next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=Next;
            }
            Node left=head;
            Node right=prev;
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
            
        }
        public static Boolean hasCycle(){
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }


        public static void removeCycle(){
            Node slow=head;
            Node fast=head;
            Boolean cycle=false;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    cycle=true;
                    break;
                }
            }
            if(!cycle){
                return;
            }
            slow=head;
            Node prev=null;
            while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
                if(slow==fast){
                    break;
                }
            }
            prev.next=null;

        }
        public void zigzag(){
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node prev=null;
            Node curr=slow.next;
            slow.next=null;
            Node Next;
            while(curr!=null){
                Next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=Next;
            }
            Node LH=head;
            Node RH=prev;
            while(LH!=null&&RH!=null){
                Node nextLeft=LH.next;
                LH.next=RH;
                Node nextRight=RH.next;
                RH.next=nextLeft;
                LH=nextLeft;
                RH=nextRight;

            }


        }
        



        
        public static void main(String args[]){
        // LinkedList ll=new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.printList();
        // // ll.addAtMiddle(5, 1);
        // ll.printList();
        // // System.out.println(count);
        // // int element=ll.removeFirst();
        // // System.out.println(element+ " deleated from list");
        // // int el=ll.removeLast();
        // // System.out.println(el+ " deleted from list");
        // // ll.printList();
        // System.out.println("element found at index "+ ll.recSearch(4));
        // ll.reverse();
        // ll.printList();
        // System.out.println(ll.pallindrome());
        LinkedList l1=new LinkedList();
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.zigzag();
        l1.printList();
    
    }
}
