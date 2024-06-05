/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Model.Users_DAO;

/**
 *
 * @author guiespim
 */
public class SIMPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        new View.Login().setVisible(true);
        Users_DAO users = new Users_DAO();
        new View.Login_GUI(users).setVisible(true);
    }
    
}
