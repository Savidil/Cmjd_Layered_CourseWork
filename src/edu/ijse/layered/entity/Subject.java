/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author ASUS
 */
public class Subject {
    private int subjectId;
    private String subjectCode;
    private String subjectName;
    private int courseId;
    private int credits;
    
    public Subject() {}
    
    public Subject(String subjectCode, String subjectName, int courseId, int credits) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.courseId = courseId;
        this.credits = credits;
    }
    
    // Getters and Setters
    public int getSubjectId() { return subjectId; }
    public void setSubjectId(int subjectId) { this.subjectId = subjectId; }
    
    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }
    
    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }
    
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }
    
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
}
