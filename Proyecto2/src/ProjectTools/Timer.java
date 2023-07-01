/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTools;

/**
 *
 * @author juanmendezl
 */
public class Timer {
    public static String today(){
        String time = String.valueOf( java.time.LocalDate.now());
        String[] auxtime = time.split("-");
        String actualtime = auxtime[2] + "/" + auxtime[1] + "/" + auxtime[0];
        return actualtime;    
    }     
}
