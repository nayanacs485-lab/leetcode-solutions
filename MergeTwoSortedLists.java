public class MergeTwoSortedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node merge(Node a, Node b) {

        Node dummy = new Node(0);
        Node current = dummy;

        while (a != null && b != null) {

            if (a.data < b.data) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }

            current = current.next;
        }

        if (a != null) {
            current.next = a;
        } else {
            current.next = b;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(4);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(4);

        Node result = merge(a, b);

        System.out.print("Merged List: ");

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
