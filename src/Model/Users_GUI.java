/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import Model.User_GUI;
import javax.swing.*;

/**
 *
 * @author guiespim
 */
public class Users_GUI {
    ArrayList<User_GUI> users = new ArrayList<User_GUI>();
    
    public boolean register(User_GUI user, View.Register_GUI registerClass) {
        for (User_GUI item : users) {
            if (item.username.equals(user.username) || item.email.equals(user.email)) {
                JOptionPane.showMessageDialog(registerClass, "Usuário já cadastrado!", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        users.add(user);
        JOptionPane.showMessageDialog(registerClass, "Usuário criado com sucesso!");
        return true;
    }
    
    public boolean login(User_GUI user, View.Login_GUI loginClass) {
        for (User_GUI item : users) {
            if (item.username.equals(user.username)) {
                if (item.password.equals(user.password)) {
                    JOptionPane.showMessageDialog(loginClass, "Bem-vindo (a)" + user.username + "!");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(loginClass, "Senha incorreta!", "", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }
        JOptionPane.showMessageDialog(loginClass, "Usuário não encontrado!", "", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
