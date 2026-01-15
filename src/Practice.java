public class Practice {
    public static void main(String[] args) {
        Node head = new Node('g', null);
        Node ryan = new Node('s', null);
        head.next = ryan;
        ryan.next = new Node('t', null);
        ryan.next.next = new Node('x', null); 

        // expect to pritn true
        System.out.println(contains(head, 'x'));
        // expect to print false
        System.out.println(contains(head, 'z'));

        remove(head, 'g');
        printList(head);
    }

    public static void printList(Node start) {
        Node current = start;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static boolean contains(Node head, char toFind) {
        while(head != null) {
            if (head.value == toFind) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    // remove the first node that has toRemove
    public static char remove(Node head, char toRemove) {
        Node current = head;

        while(current.next != null) {
            if(current.next.value == toRemove) {
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }
        return '\0';
    }
}
