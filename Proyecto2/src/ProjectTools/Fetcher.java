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
public class Fetcher {
    public static String fetchHistory(String room, History[] histories){
        String[] data = null;
        int i = 0;
        int n = 0;
        while (i < data.length){
            if (histories[i].getRoom().equals(room)){
                data[n] = histories[i].getCi() + " " + histories[i].getFirstname() + " " + histories[i].getLastname() + " " + histories[i].getGender() + " " + histories[i].getIndate();
                n++;
            }
            i++;
        }
        return null;
    }
}
