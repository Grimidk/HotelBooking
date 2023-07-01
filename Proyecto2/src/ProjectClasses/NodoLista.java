/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectClasses;

/**
 *
 * @author juanmendezl
 */
public class NodoLista<T> {
    private T data;
    private NodoLista<T> pnext;

    public NodoLista(T data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the pnext
     */
    public NodoLista<T> getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(NodoLista<T> pnext) {
        this.pnext = pnext;
    }
}
