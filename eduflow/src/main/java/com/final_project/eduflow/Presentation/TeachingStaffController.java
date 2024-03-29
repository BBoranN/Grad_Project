package com.final_project.eduflow.Presentation;


import com.final_project.eduflow.Data.Entities.TeachingStaff;
import com.final_project.eduflow.Presentation.ResponseClasses.StaffInfoForAdmin;
import com.final_project.eduflow.Services.TeachingStaffService;

import jakarta.servlet.http.HttpServletRequest;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class TeachingStaffController {

    private final TeachingStaffService teachingStaffService;

    public TeachingStaffController(TeachingStaffService teachingStaffService) {
        this.teachingStaffService = teachingStaffService;
    }


    @GetMapping("/getStaffInfoForAdmin")
    @PreAuthorize("hasAuthority('Admin')")
    public ResponseEntity<List<StaffInfoForAdmin>> getStaffInfoForAdmin(HttpServletRequest request) {
        List<StaffInfoForAdmin> staffInfoForAdmin = teachingStaffService.getStaffInfoForAdmin();
        return ResponseEntity.ok(staffInfoForAdmin);
    }

    @PostMapping("/addStaff")
    @PreAuthorize("hasAuthority('Admin')")
    public ResponseEntity<?> addStaff(@RequestBody TeachingStaff newTeachingStaff) {

        var result =teachingStaffService.addStaff(newTeachingStaff);
        return ResponseEntity.ok().body(result);
    }
    
    @PutMapping("/updateStaff")
    @PreAuthorize("hasAuthority('Admin')")
    public ResponseEntity<?> updateStaff(@RequestBody TeachingStaff teachingStaff) {
        var result = teachingStaffService.updateStaff(teachingStaff);
        return ResponseEntity.ok().body(result);
    }
    
    
}
