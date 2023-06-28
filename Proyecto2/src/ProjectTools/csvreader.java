/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTools;
import ProjectClasses.*;
import java.awt.*;
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanmendezl
 */
public class csvreader {
    public static String getCsv(String filepath){
    String data = "";
        try (Scanner scanner = new Scanner(new File(filepath))) {
        scanner.useDelimiter(","); 
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            data += line;
            data += "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    return data;
    } 
}
