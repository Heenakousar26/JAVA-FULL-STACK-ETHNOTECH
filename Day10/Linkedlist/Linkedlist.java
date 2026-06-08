package Day10.Linkedlist;


    public class Linkedlist {

        private Node head;
        private Node tail;
        private int size;

        //Insert at first

        void addFirst(int value){
            Node node=new Node(value);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }
            size++;
        }

        //Insert at last

        void addLast(int value){
            if(tail==null)
            {
                addFirst(value);
                return;
            }
            Node node=new Node(value);
            tail.next=node;
            tail=node;
            size++;
        }

        void insert(int index,int value)
        {
            if(index==0){
                addFirst(value);
                return;
            }
            if(index==size)
            {
                addLast(value);
                return;
            }
            Node temp=head;
            for (int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            Node node=new Node(value,temp.next);
            temp.next=node;
            size++;
        }

        //Display elements

        void display()
        {
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+" -> ");
                temp=temp.next;
            }
            System.out.println("End");
        }

        private class Node{
            private int value;
            private Node next;

            public Node(int value){
                this.value=value;
            }
            public Node(int value,Node next){
                this.value=value;
                this.next=next;
            }
        }

        public static void main(String[] args) {
            Linkedlist l1=new Linkedlist();
            l1.addFirst(1);
            l1.addFirst(2);
            l1.addFirst(3);
            l1.addFirst(4);
            l1.addLast(7);
            l1.insert(2,10);
            l1.display();
        }
    }


