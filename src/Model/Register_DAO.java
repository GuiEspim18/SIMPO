/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;

/**
 *
 * @author guiespim
 */
public class Register_DAO {
    
    public int id;
    public int register;
    public float pH;
    public float temperature;
    public float dissolvedOxygen;
    public float mercury;
    public float microplastic;
    public Date date;
    
    public Register_DAO(int id,int register, float pH, float temperature, float dissolvedOxygen, float mercury, float microplastic, Date date) {
        this.id = id;
        this.register = register;
        this.pH = pH;
        this.temperature = temperature;
        this.dissolvedOxygen = dissolvedOxygen;
        this.mercury = mercury;
        this.microplastic = microplastic;
        this.date = date;
    }
    
}
