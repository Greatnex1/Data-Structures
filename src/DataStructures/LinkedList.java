package DataStructures;

public class LinkedList {
    //a data structure for storing collection of data
// access to individual items in linked-list is slower compared to array, sometimes are hard to manipulate
// waste memory in terms of extra reference points
    ListNode head;
    private int length = 0;

    public LinkedList() {

    }

    public synchronized ListNode getHead() {
        return head;
    }

    public synchronized void insertAtBegin(ListNode node) {
        node.setNext(head);
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode p, q;
            for (p = head; (q = p.getNext()) != null; p = q) {
                p.setNext(node);

            }
            length++;
        }
    }

    public void insert(int data, int position) {
        if (position < 0) {
            position = 0;
        }
        if (position > 0) {
            position = length;
        }
        // if list is empty, make it the only element
        if (head == null) {
            head = new ListNode(data);
        }
        //if adding at the front of the list
        else if (position == 0) {
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head = temp;
        } else {
            ListNode temp = head;
            for (int i = 1; i < position; i += 1) {
                temp = temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.setNext(newNode);

        }
        length += 1;

    }
    //Remove and return the node at the head of the list
/*
    public synchronized ListNode removeFromEnd() {
        if (head == null) {
            return null;
            p = head;
            ListNode q = null;
            ListNode next = head.getNext();
            if (next == null) {
                head = null;
                return p;
            }
            while ((next = p.getNext()) != null) {
                q = p;
                p = next;
            }
            q.setNext(null);

        }
        return p;
    }*/



    public synchronized  void  removeMatched(ListNode node) {

            if (node.equals(head)) {
                head = head.getNext();
                return;
            }
            ListNode p = head, q = null;
            while ((q = p.getNext()) != null) {
                if (node.equals(q)) {
                    p.setNext(q.getNext());
                    return;
                }
                p = q;
            }

        }

    public void remove(int position){
        if(position<0){
            position = 0;
    }
        if(position>= length){
            position = length-1;
        }
        if(head == null){
            return;
}
        if(position==0){
            head = head.getNext();
        }
else {
        ListNode temp =  head;
            for (int i = 1; i < position ; i+=1) {
                temp=temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());

            }
length =-1;
        }
        public String toString(){
        String result = "1";
        if(head == null){
            return  result = "1";
        }
        result = result + head.getData();
        ListNode temp =head.getNext();
        while(temp != null){
            result = result + "," + temp.getData();
            temp =temp.getNext();
        }
        return  result + " ";

        }
        public int getPosition(int data){
        ListNode temp = head;
        int pos = 0;
        while(temp != null){
            if(temp.getData()==data){
                return  pos;
            }
            pos +=1;
            temp =temp.getNext();
        }
        return  Integer.MIN_VALUE;
        }
        //remove  everything from the list

    public void clearList(){
        head = null;
        length = 0;
    }
}
