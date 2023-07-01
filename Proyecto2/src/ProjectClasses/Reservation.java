/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectClasses;

/**
 *
 * @author juanmendezl
 */
public class Reservation {
    
    private String fname;
    private String lname;
    private String indate;
    private String outdate;
    private String room;
    private String ci;
    private String gender;
    private String email;
    private String phone;
    
    /**
     * Constructor for the reservation with all data
     * @param FirstName
     * @param LastName
     * @param Room
     * @param Indate
     * @param Outdate
     * @param ci
     * @param gender
     * @param email
     * @param phone
     */
    public Reservation(String FirstName, String LastName, String Room, String Indate, String Outdate, String ci, String gender, String email, String phone){
        this.fname = FirstName;
        this.lname = LastName;
        this.room = Room;
        this.indate = Indate;
        this.outdate = Outdate;
        this.ci = ci;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }
    
    
    public String getFirstName(){
        return this.fname;
    }
    
    public String getLastName(){
        return this.lname;
    }
    
    public String getRoom(){
        return this.room;
    }
    
     public String getIndate(){
        return this.indate;
    }
    
    public String getOutdate(){
        return this.outdate;
    }
    
    public String getCi(){
        return this.ci;
    }
    
    public String getGender(){
        return this.gender;
    }
    
     public String getEmail(){
        return this.email;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public void setNames(String Fname,String Lname){
        this.fname = Fname;
        this.lname = Lname;
    }
    
    public void setRoom(String Room){
        this.room = Room;
    }
    
    public void setCi(String ci){
        this.ci = ci;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setIndate(String indate){
        this.indate = indate;
    }
    
    public void setOutdate(String outdate){
        this.outdate = outdate;
    }
        
}
