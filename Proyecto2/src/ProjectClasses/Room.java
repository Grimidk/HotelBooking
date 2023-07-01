/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectClasses;

/**
 *
 * @author juanmendezl
 */
public class Room {
    
    private Reservation customer;
    private String number;
    private String floor;
    private String type;
    
     /**
     * Constructor for the room with all the data
     * @param Customer
     * @param Number
     * @param floor
     * @param type
     */
    public Room(Reservation Customer, String Number, String floor, String type){
        this.customer = Customer;
        this.number = Number;
        this.floor = floor;
        this.type = type;
        Customer.setRoom(Number);
        //Customer.setDates(0, 0);
    }
    
    /**
     * Constructor for the room without customer
     * @param Number
     */
    public Room(String Number, String floor, String type){
        this.number = Number;
        this.floor = floor;
        this.type = type;
        this.customer = null;
    }
    
    public Reservation getCustomer(){
        return this.customer;
    }
    
    public String getNumber(){
        return this.number;
    }
    
     public String getFloor(){
        return this.floor;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void setCustomer(Reservation user){
        this.customer = user;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public void setFloor(String floor){
        this.floor = floor;
    }
    
    public void setType(String type){
        this.type = type;
    }
}
