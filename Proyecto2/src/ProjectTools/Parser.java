/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTools;
import ProjectClasses.*;

/**
 *
 * @author juanmendezl
 * todas las funciones que pasan el csv a clases utilizables
 */
public class Parser {
    public static SimpleList parseReservation(String data){
        ProjectClasses.SimpleList myList = new SimpleList();
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            if (datos.length == 11) {
                String aux = datos[0] + datos[1] + datos[2];
                Reservation user = new Reservation(datos[3],datos[4],datos[7],datos[9],datos[10],aux,datos[6],datos[5],datos[8]);
                myList.add(user);
            } else if (datos.length == 10) {
                String aux = datos[0] + datos[1];
                Reservation user = new Reservation(datos[2],datos[3],datos[6],datos[8],datos[9],aux,datos[5],datos[4],datos[7]);
                myList.add(user);
            } else {
                String aux = datos[0];
                Reservation user = new Reservation(datos[2],datos[3],datos[6],datos[8],datos[9],aux,datos[5],datos[4],datos[7]);
                myList.add(user);
            }
            i++;
        }
        return myList;
    }
    public static HashTable parseHabitaciones(String data){
        ProjectClasses.HashTable myHashtable = new ProjectClasses.HashTable<>(11);
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            Room room = new Room(datos[0], datos[2], datos[1]);
            myHashtable.put(room.getNumber(), 0);
            i++;
        }
        return myHashtable;
    }
    public static HashTable parseEstado(String data, HashTable myHashtable){
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            Status estado = new Status(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
            String temp = estado.getFirstname()+" "+estado.getLastname();
            myHashtable.replaceValue(estado.getRoom(),temp);
            i++;
        }
        return myHashtable;
    }
    public static History[] parseHistorico(String data){
        History[] histories = null;
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            if (datos.length == 9) {
                String aux = datos[0] + datos[1] + datos[2];
                History history = new History(aux,datos[3],datos[4],datos[5],datos[6],datos[7],datos[8]);
                histories[i-1] = history;
            } else if (datos.length == 8) {
                String aux = datos[0] + datos[1];
                History history = new History(aux,datos[2],datos[3],datos[4],datos[5],datos[6],datos[7]);
                 histories[i-1] = history;
            } else {
                String aux = datos[0];
                History history = new History(aux,datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
                histories[i-1] = history;
            }
            i++;
        }
        return histories;
    }
    
    public static String reverseParseReservation(Reservation reservation){
        String data  = reservation.getCi() + "," + reservation.getFirstName() + "," + reservation.getLastName() + "," + reservation.getEmail() + "," + reservation.getGender() + "," + reservation.getRoom() + "," + reservation.getPhone() + "," + reservation.getIndate() + "," + reservation.getOutdate();
        return data;
    }
    
    public static String reverseParseHistory(History history){
        String data  = history.getCi() + "," + history.getFirstname() + "," + history.getLastname() + "," + history.getMail() + "," + history.getGender() + "," + history.getIndate() + "," + history.getRoom();
        return data;
    }
    
    public static String reverseParseStatus(Status status){
        String data  = status.getRoom() + "," + status.getFirstname() + "," + status.getLastname() + "," + status.getMail() + "," + status.getGender() + "," + status.getPhone() + "," + status.getIndate();
        return data;
    }
    
}