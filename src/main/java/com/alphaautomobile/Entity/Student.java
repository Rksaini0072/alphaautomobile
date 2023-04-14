package com.alphaautomobile.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="stutent")
public class Student {

    @Id
    @Column(name="student_id")
    int studentId;
    @Column(name="student_name")
    String studentName;
    @Column(name="student_add")
    String studentAdd;
    @Column(name="roll_no")
    int studentRoll;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAdd='" + studentAdd + '\'' +
                ", studentRoll=" + studentRoll +
                '}';
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAdd() {
        return studentAdd;
    }

    public void setStudentAdd(String studentAdd) {
        this.studentAdd = studentAdd;
    }

    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }
}