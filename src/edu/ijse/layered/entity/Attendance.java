/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author ASUS
 */
public class Attendance {
    private int attendanceId;
    private int studentId;
    private int scheduleId;
    private String attendanceStatus;
    private String markedDate;
    private int markedBy;
    
    public Attendance() {}
    
    // Getters and Setters
    public int getAttendanceId() { return attendanceId; }
    public void setAttendanceId(int attendanceId) { this.attendanceId = attendanceId; }
    
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    
    public int getScheduleId() { return scheduleId; }
    public void setScheduleId(int scheduleId) { this.scheduleId = scheduleId; }
    
    public String getAttendanceStatus() { return attendanceStatus; }
    public void setAttendanceStatus(String attendanceStatus) { this.attendanceStatus = attendanceStatus; }
    
    public String getMarkedDate() { return markedDate; }
    public void setMarkedDate(String markedDate) { this.markedDate = markedDate; }
    
    public int getMarkedBy() { return markedBy; }
    public void setMarkedBy(int markedBy) { this.markedBy = markedBy; }
}
