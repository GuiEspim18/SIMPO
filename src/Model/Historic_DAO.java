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
//-24.022996, -46.431978
/**
 *
 * @author guiespim
 */
public class Historic_DAO {
    public ArrayList<Sensor_DAO> historic = new ArrayList<Sensor_DAO>(
        Arrays.asList(
            new Sensor_DAO(
                "Sensor Guaratuba SP", 
                "SIMPO02993", 
                "-23.766494607842294", 
                "-45.898340732353624", 
                "Brasil", 
                new ArrayList<Register_DAO>(
                    Arrays.asList(
                        new Register_DAO(1, 1, 7.0f, 20.0f, 8.0f, 0.0001f, 0.1f, getDate(2024, 5, 1)),
                        new Register_DAO(1, 2, 7.2f, 18.0f, 7.5f, 0.00015f, 0.05f, getDate(2024, 5, 2)),
                        new Register_DAO(1, 3, 7.5f, 22.0f, 7.8f, 0.0002f, 0.15f, getDate(2024, 5, 3)),
                        new Register_DAO(1, 4, 3.5f, 30.0f, 2.0f, 0.005f, 5.0f, getDate(2024, 5, 4)),
                        new Register_DAO(1, 5, 9.0f, 35.0f, 1.0f, 0.01f, 10.0f, getDate(2024, 5, 5)),
                        new Register_DAO(1, 6, 4.0f, 28.0f, 3.5f, 0.008f, 6.0f, getDate(2024, 5, 6)),
                        new Register_DAO(1, 7, 9.5f, 36.0f, 0.5f, 0.015f, 12.0f, getDate(2024, 5, 7))
                    )
                )
            ),
            new Sensor_DAO(
                "Sensor Bertioga SP", 
                "SIMPO02993", 
                "-23.805496", 
                "-46.019679", 
                "Brasil", 
                new ArrayList<Register_DAO>(
                    Arrays.asList(
                        new Register_DAO(2, 8, 7.0f, 20.0f, 8.0f, 0.0001f, 0.1f, getDate(2024, 5, 1)),
                        new Register_DAO(2, 9, 7.2f, 18.0f, 7.5f, 0.00015f, 0.05f, getDate(2024, 5, 2)),
                        new Register_DAO(2, 10, 7.5f, 22.0f, 7.8f, 0.0002f, 0.15f, getDate(2024, 5, 3)),
                        new Register_DAO(2, 11, 3.5f, 30.0f, 2.0f, 0.005f, 5.0f, getDate(2024, 5, 4)),
                        new Register_DAO(2, 12, 9.0f, 35.0f, 1.0f, 0.01f, 10.0f, getDate(2024, 5, 5)),
                        new Register_DAO(2, 13, 4.0f, 28.0f, 3.5f, 0.008f, 6.0f, getDate(2024, 5, 6)),
                        new Register_DAO(2, 14, 9.5f, 36.0f, 0.5f, 0.015f, 12.0f, getDate(2024, 5, 7))
                    )
                )
            ),
            new Sensor_DAO(
                "Sensor Praia Grande SP", 
                "SIMPO02993", 
                "-24.022996", 
                "-46.431978", 
                "Brasil", 
                new ArrayList<Register_DAO>(
                    Arrays.asList(
                        new Register_DAO(3, 15, 3.5f, 30.0f, 2.0f, 0.005f, 5.0f, getDate(2024, 5, 1)),
                        new Register_DAO(3, 16, 9.0f, 35.0f, 1.0f, 0.01f, 10.0f, getDate(2024, 5, 2)),
                        new Register_DAO(3, 17, 4.0f, 28.0f, 3.5f, 0.008f, 6.0f, getDate(2024, 5, 3)),
                        new Register_DAO(3, 18, 9.5f, 36.0f, 0.5f, 0.015f, 12.0f, getDate(2024, 5, 4)),
                        new Register_DAO(3, 19, 3.8f, 32.0f, 2.5f, 0.006f, 5.5f, getDate(2024, 5, 5)),
                        new Register_DAO(3, 20, 8.5f, 33.0f, 1.5f, 0.009f, 9.0f, getDate(2024, 5, 6)),
                        new Register_DAO(3, 21, 9.3f, 34.0f, 1.2f, 0.013f, 10.5f, getDate(2024, 5, 7))
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
