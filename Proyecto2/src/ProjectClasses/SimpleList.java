/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectClasses;

/**
 *
 * @author juanmendezl
 */
public class SimpleList<T> {
    private NodoLista<T> head;
    private int size;

    public SimpleList() {
        this.head = null;
        this.size = 0;
    }
    
    /**
     * @return the head
     */
    public NodoLista<T> getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoLista<T> head) {
        this.head = head;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty(){
        return getHead() == null;
    }
    
    public void add(T data){
        NodoLista<T> node = new NodoLista<>(data);
        if (isEmpty()){
            setHead(node);
        } else {
            node.setPnext(getHead());
            setHead(node);
        }
        setSize(getSize() + 1);
    }
    
    public T get(int index){
        NodoLista<T> node = head;
        for (int i = 0; i < index; i++) {
            if (node == null) {
                return null;
            }
            node = node.getPnext();
        }
        if (node != null) {
            return node.getData();
        } else {
            return null;
        }
    }
    
    public boolean remove(T data){
        if (head == null){
            return false;
        }
        if (getHead().getData().equals(data)){
            setHead(getHead().getPnext());
            size--;
            return true;
        }
        NodoLista<T> current = this.head;
        NodoLista<T> prev = null;
        while(current != null){
            if (current.getData().equals(data)){
                prev.setPnext(current.getPnext());
                size--;
                return true;
            }
            prev = current;
            current = current.getPnext();
        }
        return false;
    }
}
