/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author ASUS
 */
public class Lecturer {
    private int lecturerId;
    private String lecturerCode;
    private String name;
    private String email;
    private String phone;
    private String department;
    private int userId;
    
    public Lecturer() {}
    
    public Lecturer(String lecturerCode, String name, String email, String phone, String department) {
        this.lecturerCode = lecturerCode;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }
    
    // Getters and Setters
    public int getLecturerId() { 
        return lecturerId; 
    }
    public void setLecturerId(int lecturerId) { 
        this.lecturerId = lecturerId; 
    }
    
    public String getLecturerCode() { 
        return lecturerCode; 
    }
    public void setLecturerCode(String lecturerCode) { 
        this.lecturerCode = lecturerCode; 
    }
    
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    
    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
    
    public String getPhone() { 
        return phone; 
    }
    public void setPhone(String phone) { 
        this.phone = phone; 
    }
    
    public String getDepartment() { 
        return department; 
    }
    public void setDepartment(String department) { 
        this.department = department; 
    }
    
    public int getUserId() { 
        return userId; 
    }
    public void setUserId(int userId) { 
        this.userId = userId; 
    }
}
