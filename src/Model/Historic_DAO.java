/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.Arrays;
import Model.Sensor_DAO;
import Model.Register_DAO;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guiespim
 */
public class Historic_DAO {
    public ArrayList<Sensor_DAO> historic = new ArrayList<Sensor_DAO>(
        Arrays.asList(
            new Sensor_DAO(
                "Sensor Guaratuba SP", 
                "HI9829", 
                "-23.766494607842294", 
                "-45.898340732353624", 
                "Brasil", 
                new ArrayList<Register_DAO>(
                    Arrays.asList(
                         new Register_DAO(7.0f, 20.0f, 8.0f, 0.0001f, 0.1f, getDate(2024, 5, 1)),
                         new Register_DAO(7.2f, 18.0f, 7.5f, 0.00015f, 0.05f, getDate(2024, 5, 2)),
                         new Register_DAO(3.5f, 30.0f, 2.0f, 0.005f, 5.0f, getDate(2024, 5, 3)),
                         new Register_DAO(9.0f, 35.0f, 1.0f, 0.01f, 10.0f, getDate(2024, 5, 4))
                    )
                )
            )
        )   
    );
    
    private static Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }
    
}
