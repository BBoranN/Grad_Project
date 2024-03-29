package com.final_project.eduflow.Data.Entities;

import com.final_project.eduflow.Data.Entities.IdClasses.StaffCommentsId;
import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "staff_comments")
@IdClass(StaffCommentsId.class)
public class StaffComments {

    @Id
    @Column(name = "request_when_created")
    private OffsetDateTime requestWhenCreated;

    @Id
    @Column(name = "request_student_id")
    private int requestStudentId;

    @Id
    @Column(name = "request_type_id")
    private int requestTypeId;

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_comment")
    private String userComment;

    @Id
    @Column(name = "time_posted")
    private OffsetDateTime timePosted;

    public StaffComments(OffsetDateTime requestWhenCreated, int requestStudentId, int requestTypeId, int userId, String userComment) {
        this.requestWhenCreated = requestWhenCreated;
        this.requestStudentId = requestStudentId;
        this.requestTypeId = requestTypeId;
        this.userId = userId;
        this.userComment = userComment;
        this.timePosted = OffsetDateTime.now();
    }

    public StaffComments() {
    }

    // getters and setters

    public OffsetDateTime getRequestWhenCreated() {
        return requestWhenCreated;
    }

    public void setRequestWhenCreated(OffsetDateTime requestWhenCreated) {
        this.requestWhenCreated = requestWhenCreated;
    }

    public int getRequestStudentId() {
        return requestStudentId;
    }

    public void setRequestStudentId(int requestStudentId) {
        this.requestStudentId = requestStudentId;
    }

    public int getRequestTypeId() {
        return requestTypeId;
    }

    public void setRequestTypeId(int requestTypeId) {
        this.requestTypeId = requestTypeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public OffsetDateTime getTimePosted() {
        return timePosted;
    }

    public void setTimePosted(OffsetDateTime timePosted) {
        this.timePosted = timePosted;
    }
}