package com.galvanize.java_app_group_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalReadinessController {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MedicalReadiness medicalReadiness;

    //CRLUD

    //Create new record
    @PostMapping("/newRecord")
    public User newUserRecord (@RequestBody User newUserRec) {
        return this.userRepository.save(newUserRec);
    }

    //Read all records
    @GetMapping("/viewAllRecords")
    public Iterable<User> viewAll() {
        return this.userRepository.findAll();
    }

    //List a specific record
    //Update a specific record
    //Delete a specific record



}