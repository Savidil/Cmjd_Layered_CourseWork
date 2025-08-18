/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author ASUS
 */
public class Student {
    private int studentId;
    private String registrationNumber;
    private String name;
    private String email;
    private String phone;
    private int courseId;
    private String enrollmentDate;
    
    public Student() {}
    
    public Student(String registrationNumber, String name, String email, String phone, int courseId) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.courseId = courseId;
    }
    
    // Getters and Setters
    public int getStudentId() { 
        return studentId; 
    }
    public void setStudentId(int studentId) { 
        this.studentId = studentId; 
    }
    
    public String getRegistrationNumber() { 
        return registrationNumber; 
    }
    public void setRegistrationNumber(String registrationNumber) { 
        this.registrationNumber = registrationNumber; 
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
    
    public int getCourseId() { 
        return courseId; 
    }
    public void setCourseId(int courseId) { 
        this.courseId = courseId; 
    }
    
    public String getEnrollmentDate() { 
        return enrollmentDate; 
    }
    public void setEnrollmentDate(String enrollmentDate) { 
        this.enrollmentDate = enrollmentDate; 
    }
}
