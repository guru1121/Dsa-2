public class Single_ll {
    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
      }
      public void print(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println("");
      }
      public void delete(){
        if(head==null){
            System.out.print("nothing to delete");
        }
        head = head.next;
      }

    public static void main(String[] args){
        Single_ll list = new Single_ll();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(4);
        list.print();

        list.delete();
        list.print();
    }
}
