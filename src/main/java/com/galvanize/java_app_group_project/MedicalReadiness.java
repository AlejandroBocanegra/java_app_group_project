package com.galvanize.java_app_group_project;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "medical_readiness_table")
public class MedicalReadiness {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "is_tasked")
    private Boolean isTasked;

    @Column(columnDefinition = "date", name = "task_depart_by_date")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date taskDepartByDate;

    @Column(name = "is_mental_check_completed")
    private Boolean isMentalCheckCompleted;

    @Column(columnDefinition = "date", name = "mental_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date mentalCheckLast;

    @Column(columnDefinition = "date", name = "mental_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date mentalCheckNext;

    @Column(name = "is_dental_check_completed")
    private Boolean isDentalCheckCompleted;

    @Column(columnDefinition = "date", name = "dental_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date dentalCheckLast;

    @Column(columnDefinition = "date", name = "dental_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date dentalCheckNext;

    @Column(name = "is_optical_check_completed")
    private Boolean isOpticalCheckCompleted;

    @Column(columnDefinition = "date", name = "optical_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date opticalCheckLast;

    @Column(columnDefinition = "date", name = "optical_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date opticalCheckNext;

    @Column(name = "is_physical_check_completed")
    private Boolean isPhysicalCheckCompleted;

    @Column(columnDefinition = "date", name = "physical_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date physicalCheckLast;

    @Column(columnDefinition = "date", name = "physical_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date physicalCheckNext;

    @Column(name = "is_malaria_shot_completed")
    private Boolean isMalariaShotCompleted;
    
    @Column(columnDefinition = "date", name = "malaria_shot_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date malariaShotLast;

    @Column(columnDefinition = "date", name = "malaria_shot_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date malariaShotNext;

    @Column(name = "is_penicillin_shot_completed")
    private Boolean isPenicillinShotCompleted;

    @Column(columnDefinition = "date", name = "penicillian_shot_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date penicillianShotLast;

    @Column(columnDefinition = "date", name = "penicillian_shot_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date penicillianShotNext;

    @Column(name = "is_anthrax_shot_completed")
    private Boolean isAnthraxShotCompleted;

    @Column(columnDefinition = "date", name = "anthrax_shot_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date anthraxShotLast;

    @Column(columnDefinition = "date", name = "anthrax_shot_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date anthraxShotNext;

    @Column(name = "is_smallpox_shot_completed")
    private Boolean isSmallpoxShotCompleted;

    @Column(columnDefinition = "date", name = "smallpox_shot_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date smallpoxShotLast;

    @Column(columnDefinition = "date", name = "smallpox_shot_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date smallpoxShotNext;

    @Column(columnDefinition = "date", name = "hiv_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date hivCheckLast;

    @Column(name = "is_hiv_check_completed")
    private Boolean isHivCheckCompleted;

    @Column(columnDefinition = "date", name = "hiv_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date hivCheckNext;

    @Column(name = "is_deplpoy_mental_check_completed")
    private Boolean isDeplpoyMentalCheckCompleted;

    @Column(columnDefinition = "date", name = "deploy_mental_check_due")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date deployMentalCheckDue;

    @Column(name = "is_return_mental_check_compelted")
    private Boolean isReturnMentalCheckCompelted;

    @Column(columnDefinition = "date", name = "return_mental_check_due")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date returnMentalCheckDue;

    @Column(name = "user_id")
    private int userID;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "medicalReadinesses")
    private User user;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsTasked() {
        return this.isTasked;
    }

    public void setIsTasked(Boolean isTasked) {
        this.isTasked = isTasked;
    }

    public Date getTaskDepartByDate() {
        return this.taskDepartByDate;
    }

    public void setTaskDepartByDate(Date taskDepartByDate) {
        this.taskDepartByDate = taskDepartByDate;
    }

    public Boolean getIsMentalCheckCompleted() {
        return this.isMentalCheckCompleted;
    }

    public void setIsMentalCheckCompleted(Boolean isMentalCheckCompleted) {
        this.isMentalCheckCompleted = isMentalCheckCompleted;
    }

    public Date getMentalCheckLast() {
        return this.mentalCheckLast;
    }

    public void setMentalCheckLast(Date mentalCheckLast) {
        this.mentalCheckLast = mentalCheckLast;
    }

    public Date getMentalCheckNext() {
        return this.mentalCheckNext;
    }

    public void setMentalCheckNext(Date mentalCheckNext) {
        this.mentalCheckNext = mentalCheckNext;
    }

    public Boolean getIsDentalCheckCompleted() {
        return this.isDentalCheckCompleted;
    }

    public void setIsDentalCheckCompleted(Boolean isDentalCheckCompleted) {
        this.isDentalCheckCompleted = isDentalCheckCompleted;
    }

    public Date getDentalCheckLast() {
        return this.dentalCheckLast;
    }

    public void setDentalCheckLast(Date dentalCheckLast) {
        this.dentalCheckLast = dentalCheckLast;
    }

    public Date getDentalCheckNext() {
        return this.dentalCheckNext;
    }

    public void setDentalCheckNext(Date dentalCheckNext) {
        this.dentalCheckNext = dentalCheckNext;
    }

    public Boolean getIsOpticalCheckCompleted() {
        return this.isOpticalCheckCompleted;
    }

    public void setIsOpticalCheckCompleted(Boolean isOpticalCheckCompleted) {
        this.isOpticalCheckCompleted = isOpticalCheckCompleted;
    }

    public Date getOpticalCheckLast() {
        return this.opticalCheckLast;
    }

    public void setOpticalCheckLast(Date opticalCheckLast) {
        this.opticalCheckLast = opticalCheckLast;
    }

    public Date getOpticalCheckNext() {
        return this.opticalCheckNext;
    }

    public void setOpticalCheckNext(Date opticalCheckNext) {
        this.opticalCheckNext = opticalCheckNext;
    }

    public Boolean getIsPhysicalCheckCompleted() {
        return this.isPhysicalCheckCompleted;
    }

    public void setIsPhysicalCheckCompleted(Boolean isPhysicalCheckCompleted) {
        this.isPhysicalCheckCompleted = isPhysicalCheckCompleted;
    }

    public Date getPhysicalCheckLast() {
        return this.physicalCheckLast;
    }

    public void setPhysicalCheckLast(Date physicalCheckLast) {
        this.physicalCheckLast = physicalCheckLast;
    }

    public Date getPhysicalCheckNext() {
        return this.physicalCheckNext;
    }

    public void setPhysicalCheckNext(Date physicalCheckNext) {
        this.physicalCheckNext = physicalCheckNext;
    }

    public Boolean getIsMalariaShotCompleted() {
        return this.isMalariaShotCompleted;
    }

    public void setIsMalariaShotCompleted(Boolean isMalariaShotCompleted) {
        this.isMalariaShotCompleted = isMalariaShotCompleted;
    }

    public Date getMalariaShotLast() {
        return this.malariaShotLast;
    }

    public void setMalariaShotLast(Date malariaShotLast) {
        this.malariaShotLast = malariaShotLast;
    }

    public Date getMalariaShotNext() {
        return this.malariaShotNext;
    }

    public void setMalariaShotNext(Date malariaShotNext) {
        this.malariaShotNext = malariaShotNext;
    }

    public Boolean getIsPenicillinShotCompleted() {
        return this.isPenicillinShotCompleted;
    }

    public void setIsPenicillinShotCompleted(Boolean isPenicillinShotCompleted) {
        this.isPenicillinShotCompleted = isPenicillinShotCompleted;
    }

    public Date getPenicillianShotLast() {
        return this.penicillianShotLast;
    }

    public void setPenicillianShotLast(Date penicillianShotLast) {
        this.penicillianShotLast = penicillianShotLast;
    }

    public Date getPenicillianShotNext() {
        return this.penicillianShotNext;
    }

    public void setPenicillianShotNext(Date penicillianShotNext) {
        this.penicillianShotNext = penicillianShotNext;
    }

    public Boolean getIsAnthraxShotCompleted() {
        return this.isAnthraxShotCompleted;
    }

    public void setIsAnthraxShotCompleted(Boolean isAnthraxShotCompleted) {
        this.isAnthraxShotCompleted = isAnthraxShotCompleted;
    }

    public Date getAnthraxShotLast() {
        return this.anthraxShotLast;
    }

    public void setAnthraxShotLast(Date anthraxShotLast) {
        this.anthraxShotLast = anthraxShotLast;
    }

    public Date getAnthraxShotNext() {
        return this.anthraxShotNext;
    }

    public void setAnthraxShotNext(Date anthraxShotNext) {
        this.anthraxShotNext = anthraxShotNext;
    }

    public Boolean getIsSmallpoxShotCompleted() {
        return this.isSmallpoxShotCompleted;
    }

    public void setIsSmallpoxShotCompleted(Boolean isSmallpoxShotCompleted) {
        this.isSmallpoxShotCompleted = isSmallpoxShotCompleted;
    }

    public Date getSmallpoxShotLast() {
        return this.smallpoxShotLast;
    }

    public void setSmallpoxShotLast(Date smallpoxShotLast) {
        this.smallpoxShotLast = smallpoxShotLast;
    }

    public Date getSmallpoxShotNext() {
        return this.smallpoxShotNext;
    }

    public void setSmallpoxShotNext(Date smallpoxShotNext) {
        this.smallpoxShotNext = smallpoxShotNext;
    }

    public Boolean getIsHivCheckCompleted() {
        return this.isHivCheckCompleted;
    }

    public void setIsHivCheckCompleted(Boolean isHivCheckCompleted) {
        this.isHivCheckCompleted = isHivCheckCompleted;
    }

    public Date getHivCheckLast() {
        return this.hivCheckLast;
    }

    public void setHivCheckLast(Date hivCheckLast) {
        this.hivCheckLast = hivCheckLast;
    }

    public Date getHivCheckNext() {
        return this.hivCheckNext;
    }

    public void setHivCheckNext(Date hivCheckNext) {
        this.hivCheckNext = hivCheckNext;
    }

    public Boolean getIsDeplpoyMentalCheckCompleted() {
        return this.isDeplpoyMentalCheckCompleted;
    }

    public void setIsDeplpoyMentalCheckCompleted(Boolean isDeplpoyMentalCheckCompleted) {
        this.isDeplpoyMentalCheckCompleted = isDeplpoyMentalCheckCompleted;
    }

    public Date getDeployMentalCheckDue() {
        return this.deployMentalCheckDue;
    }

    public void setDeployMentalCheckDue(Date deployMentalCheckDue) {
        this.deployMentalCheckDue = deployMentalCheckDue;
    }

    public Boolean getIsReturnMentalCheckCompelted() {
        return this.isReturnMentalCheckCompelted;
    }

    public void setIsReturnMentalCheckCompelted(Boolean isReturnMentalCheckCompelted) {
        this.isReturnMentalCheckCompelted = isReturnMentalCheckCompelted;
    }

    public Date getReturnMentalCheckDue() {
        return this.returnMentalCheckDue;
    }

    public void setReturnMentalCheckDue(Date returnMentalCheckDue) {
        this.returnMentalCheckDue = returnMentalCheckDue;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

}