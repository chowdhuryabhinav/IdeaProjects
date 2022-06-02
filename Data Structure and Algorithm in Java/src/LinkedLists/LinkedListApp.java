package LinkedLists;

class Node {
    Node next;
    int data;
}

class Linked {
    Node root;

    public Linked() {
        root = null;
    }

    public Node getNewNode(int key) {
        Node a = new Node();
        a.next = null;
        a.data = key;

        return a;

    }

    public Node insert(Node node, int key) {
        if (node == null) {
            return getNewNode(key);
        } else {
            node.next = insert(node.next, key);
        }

        return node;

    }

    public int getSizeOfList(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSizeOfList(node.next);
    }

    public void printList(Node node) {
        if (node == null) {
            return;
        } else {
            System.out.print(node.data + "->");
            printList(node.next);
        }
    }

    public Node rotateLinkedListAnticlockwise(Node node, int k) {
        if (k == 0 || node == null) {
            return node;
        }

        int sizeOfList = getSizeOfList(node);
        k = k % sizeOfList;

        int i = 1;
        Node temp = node;
        while (i < getSizeOfList(node) - k) {
            temp = temp.next;
            i++;
        }
        Node temp2 = temp.next;
        Node head = temp2;
        temp.next = null;

        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = node;

        return head;
    }
}

public class LinkedListApp {

    public static void main(String[] args) {
        Node root = null;
        Linked a = new Linked();
        root = a.insert(root, 1);
        root = a.insert(root, 2);
        root = a.insert(root, 3);
        root = a.insert(root, 4);

        a.printList(root);
        System.out.println();
        System.out.println(a.getSizeOfList(root));

        root = a.rotateLinkedListAnticlockwise(root,2);
        a.printList(root);
    }

}
