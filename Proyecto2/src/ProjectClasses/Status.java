/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectClasses;

/**
 *
 * @author juanmendezl
 */
public class Status {
    
    private String room;
    private String fname;
    private String lname;
    private String mail;
    private String gender;
    private String phone;
    private String indate;
    
    /**
     * Constructor for the status with all the data
     * @param room
     * @param fname
     * @param lname
     * @param mail
     * @param gender
     * @param phone
     * @param indate
     */
    public Status(String room, String fname, String lname, String mail, String gender, String phone, String indate){
        if (!room.equals("")) {
            this.room = room;
        } else {
            this.room = null;
        }
        this.fname = fname;
        this.lname = lname;
        this.mail = mail;
        this.gender = gender;
        this.phone = phone;
        this.indate = indate;
    }    
    
    public String getRoom(){
        return this.room;
    }
    
    public String getFirstname(){
        return this.fname;
    }
    
    public String getLastname(){
        return this.lname;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public String getIndate(){
        return this.indate;
    }
    
    public void setRoom(String room){
        this.room = room;
    }
    
    public void setFirstname(String fname){
        this.fname = fname;
    }
    
    public void setLastname(String lname){
        this.lname = lname;
    }
    
    public void setMail(String mail){
        this.mail = mail;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setIndate(String indate){
        this.indate = indate;
    }
}
