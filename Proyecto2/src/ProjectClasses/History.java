/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectClasses;

/**
 *
 * @author juanmendezl
 */
public class History {
    
    private String ci;
    private String fname;
    private String lname;
    private String mail;
    private String gender;
    private String indate;
    private String room;
    
    /**
     * Constructor for the history with all the data
     * @param ci
     * @param room
     * @param fname
     * @param lname
     * @param mail
     * @param gender
     * @param indate
     */
    public History(String ci, String fname, String lname, String mail, String gender, String indate,String room){
        this.ci = ci;
        this.fname = fname;
        this.lname = lname;
        this.mail = mail;
        this.gender = gender;
        this.indate = indate;
        this.room = room;
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
    
    public String getIndate(){
        return this.indate;
    }
    
    public String getCi(){
        return this.ci;
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
    
    public void setIndate(String indate){
        this.indate = indate;
    }
    
    public void setCi(String ci){
        this.ci = ci;
    }
}
