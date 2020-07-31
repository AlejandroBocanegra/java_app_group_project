package com.galvanize.java_app_group_project;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "mr_table")
public class MedicalReadiness {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mrt_id") 
    private Long mrtId;

    public Long getMrtId() {
        return this.mrtId;
    }

    public void setMrtId(Long mrtId) {
        this.mrtId = mrtId;
    }

    @Column(columnDefinition = "boolean default false", name = "mrt_is_tasked")
    private Boolean isTasked = false;

    @Column(columnDefinition = "date", name = "mrt_task_depart_by_date")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date taskDepartByDate;

    @Column(name = "mrt_is_mental_check_completed", columnDefinition = "boolean default false")
    private Boolean isMentalCheckCompleted = false;

    @Column(columnDefinition = "date", name = "mrt_mental_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date mentalCheckLast= new Date();

    @Column(columnDefinition = "date", name = "mrt_mental_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date mentalCheckNext= new Date();

    @Column(name = "mrt_is_dental_check_completed", columnDefinition = "boolean default false")
    private Boolean isDentalCheckCompleted = false;

    @Column(columnDefinition = "date", name = "mrt_dental_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date dentalCheckLast= new Date();

    @Column(columnDefinition = "date", name = "mrt_dental_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date dentalCheckNext= new Date();

    @Column(name = "mrt_is_optical_check_completed", columnDefinition = "boolean default false")
    private Boolean isOpticalCheckCompleted = false;

    @Column(columnDefinition = "date", name = "mrt_optical_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date opticalCheckLast= new Date();

    @Column(columnDefinition = "date", name = "mrt_optical_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date opticalCheckNext= new Date();

    @Column(name = "mrt_is_physical_check_completed", columnDefinition = "boolean default false")
    private Boolean isPhysicalCheckCompleted = false;

    @Column(columnDefinition = "date", name = "mrt_physical_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date physicalCheckLast= new Date();

    @Column(columnDefinition = "date", name = "mrt_physical_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date physicalCheckNext= new Date();

    @Column(name = "mrt_is_malaria_shot_completed", columnDefinition = "boolean default false")
    private Boolean isMalariaShotCompleted = false;

    @Column(columnDefinition = "date", name = "mrt_malaria_shot_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date malariaShotLast= new Date();

    @Column(columnDefinition = "date", name = "mrt_malaria_shot_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date malariaShotNext= new Date();

    @Column(name = "mrt_is_penicillin_shot_completed", columnDefinition = "boolean default false")
    private Boolean isPenicillinShotCompleted= false;

    @Column(columnDefinition = "date", name = "mrt_penicillian_shot_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date penicillianShotLast= new Date();

    @Column(columnDefinition = "date", name = "mrt_penicillian_shot_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date penicillianShotNext= new Date();

    @Column(name = "mrt_is_anthrax_shot_completed", columnDefinition = "boolean default false")
    private Boolean isAnthraxShotCompleted= false;

    @Column(columnDefinition = "date", name = "mrt_anthrax_shot_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date anthraxShotLast= new Date();

    @Column(columnDefinition = "date", name = "mrt_anthrax_shot_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date anthraxShotNext= new Date();

    @Column(name = "mrt_is_smallpox_shot_completed", columnDefinition = "boolean default false")
    private Boolean isSmallpoxShotCompleted= false;

    @Column(columnDefinition = "date", name = "mrt_smallpox_shot_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date smallpoxShotLast= new Date();

    @Column(columnDefinition = "date", name = "mrt_smallpox_shot_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date smallpoxShotNext= new Date();

    @Column(columnDefinition = "date", name = "mrt_hiv_check_last")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date hivCheckLast= new Date();

    @Column(name = "mrt_is_hiv_check_completed", columnDefinition = "boolean default false")
    private Boolean isHivCheckCompleted= false;

    @Column(columnDefinition = "date", name = "mrt_hiv_check_next")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date hivCheckNext= new Date();

    @Column(name = "mrt_is_deplpoy_mental_check_completed", columnDefinition = "boolean default false")
    private Boolean isDeplpoyMentalCheckCompleted= false;

    @Column(columnDefinition = "date", name = "mrt_deploy_mental_check_due")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date deployMentalCheckDue= new Date();

    @Column(name = "mrt_is_return_mental_check_compelted", columnDefinition = "boolean default false")
    private Boolean isReturnMentalCheckCompelted = false;

    @Column(columnDefinition = "date", name = "mrt_return_mental_check_due")
    @JsonFormat(pattern = "dd-MMM-yy")
    private Date returnMentalCheckDue= new Date();

    @OneToOne(mappedBy = "test01")

    // Getters and Setters
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

}