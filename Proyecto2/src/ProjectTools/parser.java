/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTools;
import ProjectClasses.*;

/**
 *
 * @author juanmendezl
 */
public class parser {
    public static void parseUsuarios(String data){
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            String[] aux1 = datos[0].split("");
            String[] aux2 = datos[2].split("");
            String ciaux = aux1[1] + aux1[2] + datos[1] + aux1[1] + aux2[2];
            User user = new User(datos[3],datos[4],datos[7],datos[9],datos[10],ciaux,datos[6],datos[5],datos[8]);
            i++;
        }
    }
    public static void parseHabitaciones(String data){
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            Room room = new Room(datos[0], datos[2], datos[1]);
            i++;
        }
    }
    public static void parseReservas(String data){
        String[] lines = data.split("\n");
        int i = 1;
        while (i < lines.length) {
            String[] datos = lines[i].split(",");
            Reservation reserva = new Reservation(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
            System.out.println(reserva.getIndate());
            i++;
        }
    }
    
}
