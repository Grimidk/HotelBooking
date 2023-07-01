/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTools;
import ProjectClasses.*; 

/**
 *
 * @author juanmendezl
 * todo lo que es pasar de una clase a otra
 */
public class Converter {
    public static Status checkIn(Reservation reserva, HashTable myHashtable){
        String room = null;
        String roomtype = reserva.getRoom();
        myHashtable.getHab(0);
        Status estado = new Status(room,reserva.getFirstName(),reserva.getLastName(),reserva.getEmail(),reserva.getGender(),reserva.getPhone(),reserva.getIndate());
        return estado;
    }
    
    public static History checkOut(String fname, String lname, HashTable myHashtable){
//        String aux = fname + " " + lname;
//        K key = myHashtable.getHab(aux);
//        myHashtable.replaceValue(key, 0);
//        Status estado = 
//        History history = new History();
        return null;
    }
}
