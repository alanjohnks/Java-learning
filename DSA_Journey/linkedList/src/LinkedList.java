public class LinkedList
{
    Node head;
    public void insert (int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head==null)
        {
            head=node;
        }
        else
        {
            Node n = head;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertFirst(int data)
    {
        Node node = head;
        Node first = new Node();
        first.data = data;
        first.next = node;
        head = first;
    }

    public void insertAt(int index,int data)
    {
        Node node = head;
        Node At = new Node();
        At.data = data;
        At.next = node;
        int value = 0;
        while (node.next!=null)
        {
            value++;
            if (value == index)
            {
                At.next = node.next;
                node.next = At;
                break;
            }
            node = node.next;
        }
    }

    public void deleteAt(int index)
    {
        Node node = head;
        int value = 0;

        if (index == 0)
        {
            head = head.next;
        }

        else
        {
            while (node.next!=null)
            {
                if (value == (index-1))
                {
                    Node deleteNode = node.next;
                    Node joinNode = deleteNode.next;
                    node.next = joinNode;
                    break;
                }
                node = node.next;
                value++;
            }
        }
    }

    public void show ()
    {
        Node node = head;
        while (node.next!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void getSize ()
    {
        Node node = head;
        int length = 0;
        while (node.next!=null)
        {
            node = node.next;
            length++;
        }
        System.out.println(length+1);
    }
}
