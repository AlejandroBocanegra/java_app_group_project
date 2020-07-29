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

@RestController
public class MedicalReadinessController {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MedicalReadinessRepository recordRepository;

    //CRLUD

    //Create new record
    @PostMapping("/newUser")
    public User newUserRecord (@RequestBody User newUser) {
        return this.userRepository.save(newUser);
    }

    @PostMapping("/newRecord")
    public MedicalReadiness newMedicalRecord (@RequestBody MedicalReadiness newRecord) {
        return this.recordRepository.save(newRecord);
    }

    //Read all records
    @GetMapping("/viewAllUsers")
    public Iterable<User> viewAllUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/viewAllRecords")
    public Iterable<MedicalReadiness> viewAllRecords() {
        return this.recordRepository.findAll();
    }

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
    
    @GetMapping("/viewRecord/{id}")
    public MedicalReadiness getRecordById (@PathVariable("id") Long recordId) {
        Optional <MedicalReadiness> i= this.recordRepository.findById(recordId);
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

    @PutMapping("/updateRecord/{id}")
    public MedicalReadiness updateRecordById (@PathVariable("id") Long recordId, @RequestBody MedicalReadiness recordUpdateInfo) {
        if (this.recordRepository.existsById(recordId)) {
            MedicalReadiness recordUpdate= this.recordRepository.findById(recordId).get();

            if (recordUpdateInfo.getIsTasked() !=null) {
                recordUpdate.setIsTasked(recordUpdateInfo.getIsTasked());
            }

            if (recordUpdateInfo.getTaskDepartByDate() !=null) {
                recordUpdate.setTaskDepartByDate(recordUpdateInfo.getTaskDepartByDate());
            }

            if (recordUpdateInfo.getIsMentalCheckCompleted() !=null) {
                recordUpdate.setIsMentalCheckCompleted(recordUpdateInfo.getIsMentalCheckCompleted());
            }

            if (recordUpdateInfo.getMentalCheckLast() !=null) {
                recordUpdate.setMentalCheckLast(recordUpdateInfo.getMentalCheckLast());
            }

            if (recordUpdateInfo.getMentalCheckNext() !=null) {
                recordUpdate.setMentalCheckNext(recordUpdateInfo.getMentalCheckNext());
            }

            if (recordUpdateInfo.getIsDentalCheckCompleted() !=null) {
                recordUpdate.setIsDentalCheckCompleted(recordUpdateInfo.getIsDentalCheckCompleted());
            }

            if (recordUpdateInfo.getDentalCheckLast() !=null) {
                recordUpdate.setDentalCheckLast(recordUpdateInfo.getDentalCheckLast());
            }

            if (recordUpdateInfo.getDentalCheckNext() !=null) {
                recordUpdate.setDentalCheckNext(recordUpdateInfo.getDentalCheckNext());
            }

            if (recordUpdateInfo.getIsOpticalCheckCompleted() !=null) {
                recordUpdate.setIsOpticalCheckCompleted(recordUpdateInfo.getIsOpticalCheckCompleted());
            }

            if (recordUpdateInfo.getOpticalCheckLast() !=null) {
                recordUpdate.setOpticalCheckLast(recordUpdateInfo.getOpticalCheckLast());
            }

            if (recordUpdateInfo.getOpticalCheckNext() !=null) {
                recordUpdate.setOpticalCheckNext(recordUpdateInfo.getOpticalCheckNext());
            }

            if (recordUpdateInfo.getIsPhysicalCheckCompleted() !=null) {
                recordUpdate.setIsPhysicalCheckCompleted(recordUpdateInfo.getIsPhysicalCheckCompleted());
            }

            if (recordUpdateInfo.getPhysicalCheckLast() !=null) {
                recordUpdate.setPhysicalCheckLast(recordUpdateInfo.getPhysicalCheckLast());
            }

            if (recordUpdateInfo.getPhysicalCheckNext() !=null) {
                recordUpdate.setPhysicalCheckNext(recordUpdateInfo.getPhysicalCheckNext());
            }

            if (recordUpdateInfo.getIsMalariaShotCompleted() !=null) {
                recordUpdate.setIsMalariaShotCompleted(recordUpdateInfo.getIsMalariaShotCompleted());
            }

            if (recordUpdateInfo.getMalariaShotLast() !=null) {
                recordUpdate.setMalariaShotLast(recordUpdateInfo.getMalariaShotLast());
            }

            if (recordUpdateInfo.getMalariaShotNext() !=null) {
                recordUpdate.setMalariaShotNext(recordUpdateInfo.getMalariaShotNext());
            }

            if (recordUpdateInfo.getIsPenicillinShotCompleted() !=null) {
                recordUpdate.setIsPenicillinShotCompleted(recordUpdateInfo.getIsPenicillinShotCompleted());
            }

            if (recordUpdateInfo.getPenicillianShotLast() !=null) {
                recordUpdate.setPenicillianShotLast(recordUpdateInfo.getPenicillianShotLast());
            }

            if (recordUpdateInfo.getPenicillianShotNext() !=null) {
                recordUpdate.setPenicillianShotNext(recordUpdateInfo.getPenicillianShotNext());
            }

            if (recordUpdateInfo.getIsAnthraxShotCompleted() !=null) {
                recordUpdate.setIsAnthraxShotCompleted(recordUpdateInfo.getIsAnthraxShotCompleted());
            }

            if (recordUpdateInfo.getAnthraxShotLast() !=null) {
                recordUpdate.setAnthraxShotLast(recordUpdateInfo.getAnthraxShotLast());
            }

            if (recordUpdateInfo.getAnthraxShotNext() !=null) {
                recordUpdate.setAnthraxShotNext(recordUpdateInfo.getAnthraxShotNext());
            }

            if (recordUpdateInfo.getIsSmallpoxShotCompleted() !=null) {
                recordUpdate.setIsSmallpoxShotCompleted(recordUpdateInfo.getIsSmallpoxShotCompleted());
            }

            if (recordUpdateInfo.getSmallpoxShotLast() !=null) {
                recordUpdate.setSmallpoxShotLast(recordUpdateInfo.getSmallpoxShotLast());
            }

            if (recordUpdateInfo.getSmallpoxShotNext() !=null) {
                recordUpdate.setSmallpoxShotNext(recordUpdateInfo.getSmallpoxShotNext());
            }

            if (recordUpdateInfo.getIsHivCheckCompleted() !=null) {
                recordUpdate.setIsHivCheckCompleted(recordUpdateInfo.getIsHivCheckCompleted());
            }

            if (recordUpdateInfo.getHivCheckLast() !=null) {
                recordUpdate.setHivCheckLast(recordUpdateInfo.getHivCheckLast());
            }

            if (recordUpdateInfo.getHivCheckNext() !=null) {
                recordUpdate.setHivCheckNext(recordUpdateInfo.getHivCheckNext());
            }

            if (recordUpdateInfo.getIsDeplpoyMentalCheckCompleted() !=null) {
                recordUpdate.setIsDeplpoyMentalCheckCompleted(recordUpdateInfo.getIsDeplpoyMentalCheckCompleted());
            }

            if (recordUpdateInfo.getDeployMentalCheckDue() !=null) {
                recordUpdate.setDeployMentalCheckDue(recordUpdateInfo.getDeployMentalCheckDue());
            }

            if (recordUpdateInfo.getIsReturnMentalCheckCompelted() !=null) {
                recordUpdate.setIsReturnMentalCheckCompelted(recordUpdateInfo.getIsReturnMentalCheckCompelted());
            }

            if (recordUpdateInfo.getReturnMentalCheckDue() !=null) {
                recordUpdate.setReturnMentalCheckDue(recordUpdateInfo.getReturnMentalCheckDue());
            }

            return this.recordRepository.save(recordUpdate);

        } else {
            return null;
        }
    }

    //Delete a specific record
    @DeleteMapping("/deleteUser/{id}")
    public Long deleteUserById(@PathVariable("id") Long userId) {
        if (this.userRepository.existsById(userId)) {
            this.userRepository.deleteById(userId);
            return this.userRepository.count();
        } else {
            return null;
        }
    }

    @DeleteMapping("/deleteRecord/{id}")
    public Long deleteRecordById(@PathVariable("id") Long recordId) {
        if (this.recordRepository.existsById(recordId)) {
            this.recordRepository.deleteById(recordId);
            return this.recordRepository.count();
        } else {
            return null;
        }
    }

}