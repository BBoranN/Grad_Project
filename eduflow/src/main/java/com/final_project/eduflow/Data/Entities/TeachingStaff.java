package com.final_project.eduflow.Data.Entities;

import jakarta.persistence.*;;

@Entity
@Table(name = "teaching_staff")
public class TeachingStaff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    public Integer getDepartmentId() {
        return departmentId;
    }
    
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmail() {
        return email;
    }
    public String getFullName(){
        return name + " " + surname;
    }

    public long getId() {
        return id;
    }
}