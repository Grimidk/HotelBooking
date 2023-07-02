/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTools;
import ProjectClasses.*;
import javax.swing.JOptionPane;


/**
 *
 * @author juanmendezl
 * todo lo que es recivir datos
 */
public class Reciever {
    public static Reservation reservationReciever(){
        String fname = JOptionPane.showInputDialog(null,"Ingrese el nombre: ", "Nombre");      
        while (!fname.chars().allMatch(Character::isLetter) & fname != null){
            fname = JOptionPane.showInputDialog(null,"Ingrese un nombre valido: ", "Nombre");
        }
        String lname = JOptionPane.showInputDialog(null,"Ingrese el apellido: ", "Apellido");      
        while (!lname.chars().allMatch(Character::isLetter) & lname != null){
            lname = JOptionPane.showInputDialog(null,"Ingrese un apellido valido: ", "Apellido");    
        }
        String indate = JOptionPane.showInputDialog(null,"Ingrese la fecha de llegada: ", "01/01/2000"); 
        while (!Checker.isValiddate(indate) & indate != null) {
            indate = JOptionPane.showInputDialog(null,"Ingrese una fecha valida: ", "01/01/2000"); 
        }
        String outdate = JOptionPane.showInputDialog(null,"Ingrese la fecha de salida: ", "02/01/2000"); 
        while (!Checker.isValiddate(outdate) & outdate != null) {
            outdate = JOptionPane.showInputDialog(null,"Ingrese una fecha valida: ", "02/01/2000"); 
        }
        while (!Checker.areValiddates(indate,outdate)) {
            outdate = JOptionPane.showInputDialog(null,"Ingrese una fecha mayor a la llegada: ", "02/01/2000");          }
        String room = JOptionPane.showInputDialog(null,"Ingrese el tipo de cuarto (simple, doble, triple o suite) que desea: ", "suite"); 
        while (!Checker.isRoom(room) & room != null) {
            room = JOptionPane.showInputDialog(null,"Ingrese un tipo valido (simple, doble, triple o suite): ", "suite"); 
        }
        String ci = JOptionPane.showInputDialog(null,"Ingrese la cedula de identidad: ", "1234567"); 
        while (!Checker.isNum(ci) & Integer.parseInt(ci)>0 & Integer.parseInt(ci)<=999999999 & ci != null) {
            ci = JOptionPane.showInputDialog(null,"Ingrese una cedula valida: ", "1234567"); 
        }
        String gender = JOptionPane.showInputDialog(null,"Ingrese el genero: ", "Male");      
        while (!gender.chars().allMatch(Character::isLetter) & gender != null){
            gender = JOptionPane.showInputDialog(null,"Ingrese un genero valido: ", "Female");
        }
        String email = JOptionPane.showInputDialog(null,"Ingrese el mail: ", "Correo@direccion.com");               
        while (!email.contains("@") || !email.contains(".") & email != null){
            email = JOptionPane.showInputDialog(null,"Ingrese un mail valido: ", "Correo@direccion.com");
        }
        String phone = JOptionPane.showInputDialog(null,"Ingrese el mail: ", "(555) 1234567");      
        while (!Checker.isValidphone(phone) & phone != null){
            phone = JOptionPane.showInputDialog(null,"Ingrese un mail valido: ", "(555) 1234567");
        }  
        Reservation user = new Reservation(fname,lname,indate,outdate,room,ci,gender,email,phone);
        return user;
    }   
}
