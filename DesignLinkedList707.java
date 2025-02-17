// because we use a dummy head:
// when for loop is looking for the indexth node, i <= index get(int index)
// when for loop is looking for the previous node, i < index addAtIndex(int index, int val) deleteAtIndex(int index)

class MyLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    private int size;// store the length of linked list
    private ListNode dummyHead;

    public MyLinkedList() {
        this.size = 0;
        this.dummyHead = new ListNode(0);        
    }
    
    // get value of indexth node
    public int get(int index) {
        // if index is invalid
        if (index < 0 || index >= size){
            return -1;
        }
        ListNode cur = dummyHead;
        // traverse from dummy head so it's index + 1 th 
        for (int i = 0; i <= index; i++){
            cur = cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        // add the node at the real head node
        newNode.next = dummyHead.next;
        dummyHead.next = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode cur = dummyHead;
        while (cur.next != null){
            // find last node
            cur = cur.next;
        }
        cur.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        // if index == size, add newNode to the end
        // if index == 0, newNode is the new head node
        if (index < 0 || index > size){
            return;
        }
        ListNode pre = dummyHead;
        // find the previous node of index
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        ListNode newNode = new ListNode (val);
        newNode.next = pre.next;
        pre.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size){
            return;
        }
        // dummyHead will used as the head when index = 0
        ListNode pre = dummyHead;
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
