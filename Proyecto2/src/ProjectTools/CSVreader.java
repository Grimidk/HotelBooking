/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTools;
import ProjectClasses.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author juanmendezl
 */
public class CSVreader {
    public static String getCsv(String filepath){
    String data = "";
        try (Scanner scanner = new Scanner(new File(filepath))) {
        scanner.useDelimiter(","); 
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            data += line;
            data += "\n";
            }
        scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    return data;
    } 
    
    public static void putCsv(String data, String filepath) {
        try (Writer writer = new FileWriter(filepath);) {
        writer.append(data);
        writer.flush();
        writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }   
}
