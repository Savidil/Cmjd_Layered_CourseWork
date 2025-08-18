/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author ASUS
 */
public class Course {
    private int courseId;
    private String courseCode;
    private String courseName;
    private String description;
    
    public Course() {}
    
    public Course(String courseCode, String courseName, String description) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.description = description;
    }
    
    // Getters and Setters
    public int getCourseId() { 
        return courseId; 
    }
    public void setCourseId(int courseId) { 
        this.courseId = courseId; 
    }
    
    public String getCourseCode() { 
        return courseCode; 
    }
    public void setCourseCode(String courseCode) { 
        this.courseCode = courseCode; 
    }
    
    public String getCourseName() { 
        return courseName; 
    }
    public void setCourseName(String courseName) { 
        this.courseName = courseName; 
    }
    
    public String getDescription() { 
        return description; 
    }
    public void setDescription(String description) { 
        this.description = description; 
    }
}
