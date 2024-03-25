package com.final_project.eduflow.Data.View;

import java.time.LocalDateTime;

import com.final_project.eduflow.Data.View.IdClasses.AllRequestsId;
import com.final_project.eduflow.Data.View.IdClasses.WaitinRequestsViewId;

import jakarta.persistence.*;

@Entity
@Table(name = "all_requests_with_actors_view")
@IdClass(AllRequestsId.class)
public class AllRequestsForStaffView {
    
    @Id
    @Column(name = "student_id")
    private long studentId;

    @Column(name = "request_type_id")
    private int requestTypeId;

    @Column(name = "request_name")
    private String requestTypeName;

    @Column(name = "current_index")
    private int current_index;

    @Column(name = "information")
    private String information;

    @Id
    @Column(name = "when_created")
    private LocalDateTime whenCreated;

    @Id
    @Column(name = "actor_id")
    private long actorId;

    @Column(name = "status")
    private String status;
    // getters and setters
    
    public long getStudentId() {
        return studentId;
    }

    public int getRequestTypeId() {
        return requestTypeId;
    }

    public String getRequestTypeName() {
        return requestTypeName;
    }

    public int getCurrent_index() {
        return current_index;
    }

    public String getInformation() {
        return information;
    }

    public LocalDateTime getWhenCreated() {
        return whenCreated;
    }

    public long getCurrentActorId() {
        return actorId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setRequestTypeId(int requestTypeId) {
        this.requestTypeId = requestTypeId;
    }

    public void setRequestTypeName(String requestTypeName) {
        this.requestTypeName = requestTypeName;
    }

    public void setCurrent_index(int current_index) {
        this.current_index = current_index;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setWhenCreated(LocalDateTime whenCreated) {
        this.whenCreated = whenCreated;
    }

    public void setCurrentActorId(long currentActorId) {
        this.actorId = currentActorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
