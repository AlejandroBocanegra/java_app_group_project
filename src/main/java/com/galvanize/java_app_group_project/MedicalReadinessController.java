package com.galvanize.java_app_group_project;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MedicalReadinessController {
    
    @Autowired
    private UserRepository userRepository;

    // @Autowired
    // private MedicalReadinessRepository medicalReadinessRepository;

    //CRLUD

    //Create new record
    @PostMapping("/newRecord")
    public User newUserRecord (@RequestBody User newUserRec) {
        return this.userRepository.save(newUserRec);
    }

    // @PostMapping("/test")
    // public MedicalReadiness newMedicalRecord (@RequestBody MedicalReadiness newUserRec) {
    //     return this.medicalReadinessRepository.save(newUserRec);
    // }

    //Read all records
    @GetMapping("/viewAllRecords")
    public Iterable<User> viewAll() {
        return this.userRepository.findAll();
    }

    // @GetMapping("/testdeux")
    // public Iterable<MedicalReadiness> viewAllMed() {
    //     return this.medicalReadinessRepository.findAll();
    // }

    //List a specific record
    @GetMapping("/viewUser/{id}")
    public User getUserById (@PathVariable("id") Long userId) {
        Optional <User> i= this.userRepository.findById(userId);
        if (i.isPresent()) {
            return i.get();
        } else {
            return null;
        }
    }
    

    //Update a specific record
    @PutMapping("/updateUser/{id}")
    public User updateUserById (@PathVariable("id") Long userId, @RequestBody User userUpdateInfo) {
        if (this.userRepository.existsById(userId)) {
            User userUpdate= this.userRepository.findById(userId).get();

            if (userUpdateInfo.getGrade() !=null) {
                userUpdate.setGrade(userUpdateInfo.getGrade());
            }

            if (userUpdateInfo.getLastName() !=null) {
                userUpdate.setLastName(userUpdateInfo.getLastName());
            }

            if (userUpdateInfo.getFirstName() !=null) {
                userUpdate.setFirstName(userUpdateInfo.getFirstName());
            }

            if (userUpdateInfo.getEdipi() !=null) {
                userUpdate.setEdipi(userUpdateInfo.getEdipi());
            }

            if (userUpdateInfo.getAfsc() !=null) {
                userUpdate.setAfsc(userUpdateInfo.getAfsc());
            }

            if (userUpdateInfo.getRole() !=null) {
                userUpdate.setRole(userUpdateInfo.getRole());
            }

            if (userUpdateInfo.getBase() !=null) {
                userUpdate.setBase(userUpdateInfo.getBase());
            }

            if (userUpdateInfo.getUnit() !=null) {
                userUpdate.setUnit(userUpdateInfo.getUnit());
            }

            if (userUpdateInfo.getEmail() !=null) {
                userUpdate.setEmail(userUpdateInfo.getEmail());
            }

            if (userUpdateInfo.getPassword() !=null) {
                userUpdate.setPassword(userUpdateInfo.getPassword());
            }

            return this.userRepository.save(userUpdate);

        } else {
            return null;
        }
    }

    //Delete a specific record
    @DeleteMapping("/deleteRecord/{id}")
    public Long deleteUserById(@PathVariable("id") Long userId) {
        if (this.userRepository.existsById(userId)) {
            this.userRepository.deleteById(userId);
            return this.userRepository.count();
        } else {
            return null;
        }
    }


}