/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import Model.Register_DAO;

/**
 *
 * @author guiespim
 */
public class Sensor_DAO {
    
    public String name;
    public String model;
    public String lat;
    public String lon;
    public String country;
    public ArrayList<Register_DAO> register;
    
    public Sensor_DAO(String name, String model, String lat, String lon, String country, ArrayList<Register_DAO> register) {
        this.name = name;
        this.model = model;
        this.lat = lat;
        this.lon = lon;
        this.country = country;
        this.register = register;
    }
    
}
