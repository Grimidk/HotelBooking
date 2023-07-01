/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectClasses;

/**
 *
 * @author juanmendezl
 */
public class HashTable<K, V> {
    private SimpleList<Entry<K, V>>[] array;
    private int size;
    
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        
        Entry(K key, V value){
            this.key = key;
            this.value= value;
            this.next = null;
        }
    }

    public HashTable(int size) {
        this.size = size;
        array = new SimpleList[size];
        for (int i = 0; i < 10; i++) {
            array[i] = new SimpleList<>();
        }
    }
    
    private int getHash(K key){
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % size;
    }
    
    public void put(K key, V value){
        int index = getHash(key);
        if (array[index] == null){
            array[index] = new SimpleList<>();
        }
        SimpleList<Entry<K, V>> list = array[index];
        NodoLista<Entry<K, V>> node = list.getHead();
        while(node != null){
            Entry<K, V> entry = node.getData();
            if (entry.key.equals(key)){
                entry.value = value;
                return;
            }
            node = node.getPnext();
        }
        list.add(new Entry<>(key, value));
    }
    
    public V get(K key){
        int index = getHash(key);
        if (array[index] == null){
            return null;
        }
        SimpleList<Entry<K, V>> list = array[index];
        NodoLista<Entry<K, V>> node = list.getHead();
        while(node != null) {
            Entry<K, V> entry = node.getData();
            if(entry.key.equals(key)) {
                return entry.value;
            }
            node = node.getPnext();
        }
        return null;
    }
    
    public void remove(K key){
        int index = getHash(key);
        
        if (array[index] == null){
            return;
        }
        SimpleList<Entry<K, V>> list = array[index];
        NodoLista<Entry<K, V>> node = list.getHead();
        NodoLista<Entry<K, V>> prev = null;
        
        while (node != null){
            Entry<K, V> entry = node.getData();
            if (entry.key.equals(key)){
                if (prev == null){
                    list.setHead(node.getPnext());
                } else {
                    prev.setPnext(node.getPnext());
                }
                return;
            }
            prev = node;
            node = node.getPnext();
        }
    }
    
    public void replaceValue(K key,String replace){
        V value = get(key);
        this.remove(key);
        this.put(key,(V)replace);     
    }
    
    public K getHab(V value){
        int i = 0;
        while(i < this.size){
            NodoLista<Entry<K, V>> aux = array[i].getHead();
            while(aux != null) {
                if(aux.getData().value.equals(value)){
                    return aux.getData().key;    
                }
                aux = aux.getPnext();
            i++;
            }
        }
        return null;
    }
}
