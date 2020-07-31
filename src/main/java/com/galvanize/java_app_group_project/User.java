package com.galvanize.java_app_group_project;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "user_table")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "user_grade")
    private String grade;

    @Column(name= "user_last_name")
    private String lName;

    @Column(name= "user_first_name")
    private String fName;

    @Column(name= "user_edipi")
    private Integer edipi;

    @Column(name= "user_afsc")
    private String afsc;

    @Column(name= "user_role")
    private String role;

    @Column(name = "user_base")
    private String base;

    @Column(name = "user_unit")
    private String unit;

    @Column(name = "user_e_mail")
    private String eMail;

    @Column(name = "user_password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "ut_mrt_join", referencedColumnName = "mrt_id" )
    @MapsId
    private MedicalReadiness mrt;

    public MedicalReadiness getMrt() {
        return this.mrt;
    }

    public void setMrt(MedicalReadiness mrt) {
        this.mrt = mrt;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLastName() {
        return this.lName;
    }

    public void setLastName(String last_name) {
        this.lName = last_name;
    }

    public String getFirstName() {
        return this.fName;
    }

    public void setFirstName(String first_name) {
        this.fName = first_name;
    }

    public Integer getEdipi() {
        return this.edipi;
    }

    public void setEdipi(Integer edipi) {
        this.edipi = edipi;
    }

    public String getAfsc() {
        return this.afsc;
    }

    public void setAfsc(String afsc) {
        this.afsc = afsc;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBase() {
        return this.base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getEmail() {
        return this.eMail;
    }

    public void setEmail(String e_mail) {
        this.eMail = e_mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}