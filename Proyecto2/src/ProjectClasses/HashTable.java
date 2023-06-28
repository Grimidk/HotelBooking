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
public class HashTable<K> {
    private ListSimple<K>[] array;
    private int size;
    
    public HashTable(int size) {
        this.size = size;
        array = new ListSimple[size];
        int i = 0;
            while (i < size) {
                array[i] = new ListSimple();
            }
    }
    
    private int getHash(K key){
        int n = Math.abs(key.hashCode() % size);
        return n;
    }
    
    public Room get(K key){
       int n = getHash(key);
       int aux = this.array[n].getIndex(key);
       if (aux != -1){
            Room temp = this.array[n].getNodeRoom(aux);
            return temp;
       } else { 
            return null; 
       }
    }
    
    public void remove(K key){
       int n = getHash(key);
       int aux = this.array[n].getIndex(key);
       if (aux != -1){
            this.array[n].delete(aux);
       } else {
            System.out.println("Objeto no encontrado");  
       }
    }
    
    public void add(K key, Room room){
       int n = getHash(key);
       this.array[n].addLast(key, room);
    }
    
    public int getSize(){
        return this.size;
    }
}
