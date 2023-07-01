/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectApp;
import ProjectClasses.*;
import ProjectTools.*;
import ProjectInterface.*;

/**
 *
 * @author juanmendezl
 */
public class App {
    public static void Start(){
     // fecha de hoy
     String today = Timer.today();
     // importa los csv ya determinados
     String data1 = CSVreader.getCsv("Booking_hotel - General.csv");
     String data2 = CSVreader.getCsv("Booking_hotel - Habitaciones.csv");
     String data3 = CSVreader.getCsv("Booking_hotel - Estado.csv");
     String data4 = CSVreader.getCsv("Booking_hotel - Historico.csv");
     // los convirte en sus respectivas clases para poder entrarlos en hashmaps y ABB
     HashTable myHashtable = Parser.parseHabitaciones(data2);
     myHashtable = Parser.parseEstado(data3, myHashtable);
     Parser.parseReservation(data1);
     History[] histories = Parser.parseHistorico(data4);
     // interfaz inicial
     inicio ini = new inicio();
     ini.setVisible(true);
    }
}
