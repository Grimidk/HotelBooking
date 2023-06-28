/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectClasses;

/**
 *
 * @author juanmendezl
 * @param <K>
 */

public class ListSimple<K> {
    public Node<K> head;
    public Node<K> tail;

    /**
     * Constructor for initially empty list
     */
    public ListSimple() {
        this.head = this.tail = null;
    }

    /**
     * Constructor for list initially with one node
     * @param n
     */
    public ListSimple(Node<K> n) {
        this.head = this.tail = n;
    }
    
    /**
     * Checks whether list is empty or not
     * @return 
     */
    public boolean isEmpty() {
        return this.head == null;
    }
    
    /**
     *  Get the current size of the list
     * @return 
     */
    public int size() {
        int i = 0;
        
        if (isEmpty()) {
            return 0;
        }
        
        Node<K> aux = this.head;
        while(aux != null) {
            aux = aux.getNext();
            i++;
        }
        return i;
    }
    
    /**
     * Add datum to the first position of the list
     * @param key Key of the node
     * @param room Datum to be added
     */
    public void addFirst(K key,Room room) {
        Node<K> n = new Node(key, room);
        if (isEmpty()) {
            this.head = n;
            this.tail = n;
            this.head.setNext(this.tail);
            this.tail.setNext(null);
        } else {
            n.setNext(this.head);
            this.head = n;
        }
    }
    
    /**
     * Add datum to the last position of the list
     * @param room Datum to be added
     * @param key Key of the node
     */
    public void addLast(K key,Room room) {
        Node<K> n = new Node(key,room);
        if (isEmpty()) {
            this.head = n;
            this.tail = n;
            this.head.setNext(this.tail);
            this.tail.setNext(null);
        } else {
            this.tail.setNext(n);
            this.tail = n;
        }
    }
    
    /**
     * Add datum to the specified position
     * @param room room to be added
     * @param key key of the node
     * @param i Position to be added in
     */
    public void add(K key,Room room, int i) {
        if (isEmpty() || i == 0) {
            this.addFirst(key, room);
        } else if (i >= (size() - 1)) {
            this.addLast(key, room);
        } else if (i < 0) {
            this.add(key, room, size() + i);
        }else {
            Node<K> n = new Node(key,room);
            Node aux = this.head; // Nodo previo
            int count = 0;
            while(count < i -1) {
                aux = aux.getNext();
                count++;
            }
            n.setNext(aux.getNext());
            aux.setNext(n);
        }
    }

    /**
     * Deletes first element of the list
     * @return The data of the first element
     */
    public Room deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<K> temp = this.head;
        this.head= this.head.getNext();
        temp.setNext(null);
        return temp.getRoom();
    }
    
    /**
     * Deletes last element of the list
     * @return The data of the last element
     */
    public Room deleteLast() {
        if (isEmpty()) {
            return null;
        }
        Node<K> pre = this.head;
        while(pre.getNext().getNext() != null) {
            pre = pre.getNext();
        }
        Node<K> temp = pre.getNext();
        pre.setNext(null);
        this.tail = pre;
        temp.setNext(null);
        return temp.getRoom();
        
    }
    
    /**
     * Deletes the element at the specified position
     * @param i The position to be deleted
     * @return The data of the deleted element
     */
    public Room delete(int i) {
        if (isEmpty()) {
            return null;
        } else if (i == 0) {
            return deleteFirst();
        } else if (i == size() -1) {
            return deleteLast();
        } else if (i < 0)  {
            return delete(size() + i);
        } else if (i > size() - 1) {
            System.out.println("\nError");
            return null;
        } else {
            Node<K> aux = this.head;
            int count = 0;
            while(count < i-1) {
                aux = aux.getNext();
                count++;
            }
            Node<K> del = aux.getNext();
            aux.setNext(del.getNext());
            del.setNext(null);
            return del.getRoom();
        }
    }
    
    /**
     * Prints the list in a pretty format
     */
    public void print() {
        if (isEmpty()) {
            System.out.println("Vacia");
        } else {
            Node<K> aux = this.head;
            int i = 0;
            while (aux != null) {
                System.out.print(aux.getRoom() + "(" + i + ")" + " -> ");
                aux = aux.getNext();
                i++;
            }
            System.out.println("");
        }
    }
    
    /* Function to reverse the linked list */
    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static boolean compareLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.getRoom() == temp2.getRoom()) {
                temp1 = temp1.getNext();
                temp2 = temp2.getNext();
            } else {
                return false;
            }
        }

        /* Both are empty return 1*/
        if (temp1 == null && temp2 == null) {
            return true;
        }

        /* Will reach here when one is NULL
           and other is not */
        return false;
    }

    public ListSimple copy() {

        ListSimple clone = new ListSimple();

        Node aux = head;

        while (aux != null) {
            clone.addLast(aux.getKey(),aux.getRoom());
            aux = aux.getNext();
        }

        return clone;

    }

    public int getIndex(K key) {
        if (!isEmpty()) {

            Node aux = head;
            int cont = 0;

            while (aux != null) {
                   String temp = (String) aux.getKey();
                if (temp.equals((String) key)) {
                   return cont;
                }
                cont++;
                aux = aux.getNext();
            }
            return -1;
        } else {
            return -1;
        }
    }

    public Room getNodeRoom(int pos) {
        if (!isEmpty()) {
            Node aux = head;
            for (int i = 0; i < (pos - 1); i++) {
                aux = aux.getNext();
            }
            return aux.getRoom();
        } else {

            return null;
        }
    }
}