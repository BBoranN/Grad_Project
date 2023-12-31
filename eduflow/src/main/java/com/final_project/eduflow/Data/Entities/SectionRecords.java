package com.final_project.eduflow.Data.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "section_records")
@IdClass(SectionRecordsId.class)
public class SectionRecords {

    @Id
    @Column(name = "student_id")
    private long studentId;

    @Id
    @Column(name = "course_code")
    private String courseCode;

    @Id
    @Column(name = "section_number")
    private int sectionNumber;

    @Id
    @Column(name = "term")
    private String term;

    // getters and setters

    public String getCourseCode() {
        return courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public int getSectionNumber() {
        return sectionNumber;
    }
    
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }
    
    public String getTerm() {
        return term;
    }
    
    public void setTerm(String term) {
        this.term = term;
    }
}