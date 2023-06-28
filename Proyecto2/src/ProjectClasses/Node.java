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

public class Node<K> {
    
    private K key;
    private Room room;
    private Node next;
    private Node prev;

    /**
     * Constructor for the Node
     * @param room
     * @param key
     */
    public Node(K key,Room room) {
        
        this.key = key;
        this.room = room;
        this.next = null;
        this.prev = null;
    }
    
    /**
     * Get Node's key
     *
     * @return the key inside Node
     */
    public K getKey() {
        return key;
    }

    /**
     * Sets new key to Node
     *
     * @param key
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Get Node's data
     *
     * @return the data inside Node
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Sets new data to Node
     *
     * @param room
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     *
     * @return a reference to the next Node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets new Node to reference to
     *
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
     /**
     *
     * @return a reference to the previous Node
     */
    public Node getPrev() {
        return prev;
    }
    
    /**
     * Sets new Node to reference to
     *
     * @param prev
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
//    public static int comparator(Node firstNode, Node secondNode) {
//        String firstClass = firstNode.getData().getClass().getSimpleName();
//        String secondClass = secondNode.getData().getClass().getSimpleName();
//        
//        if (!firstClass.equals(secondClass)) {
//            throw new Error("Nodes does not have same data or are not the same class");
//        }
//        
//        switch (firstClass) {
//            case "Integer":
//                Integer firstDataInteger = (Integer)firstNode.getData();
//                Integer secondDataInteger = (Integer)secondNode.getData();
//                 if (firstDataInteger > secondDataInteger) {
//                    return 1;
//                } else if (secondDataInteger > firstDataInteger) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            case "Double":
//                Double firstDataDouble = (Double)firstNode.getData();
//                Double secondDataDouble = (Double)secondNode.getData();
//                if (firstDataDouble > secondDataDouble) {
//                    return 1;
//                } else if (secondDataDouble > firstDataDouble) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            case "String":
//                String firstDataString = (String)firstNode.getData();
//                String secondDataString = (String)secondNode.getData();
//                if (firstDataString.length() > secondDataString.length()) {
//                    return 1;
//                } else if (secondDataString.length() > firstDataString.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//        }
//        
//        return 0;
//    }

}