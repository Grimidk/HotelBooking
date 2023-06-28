/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectApp;
import ProjectClasses.*;
import ProjectTools.*;

/**
 *
 * @author juanmendezl
 */
public class App {
    public static void Start(){
     String data = csvreader.getCsv("/Users/juanmendezl/Desktop/Booking_hotel_estado.csv");
     parser.parseReservas(data);
    }
}
