/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;
import edu.ijse.layered.entity.User;
import java.util.List;

/**
 *
 * @author ASUS
 */

public interface UserDao {
    boolean save(User user) throws Exception;
    boolean update(User user) throws Exception;
    boolean delete(int userId) throws Exception;
    User get(int userId) throws Exception;
    List<User> getAll() throws Exception;
    User authenticate(String username, String password) throws Exception;
}
