package com.tcs.dakotadb.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "tb_profile_feedback")
public class Profile {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name", length = 255)
    private String fullName;

    @Lob
    @Column(name = "feedback")
    private String feedback;

    @Column(name = "english", length = 255)
    private String english;

    @Column(name = "spanish", length = 255)
    private String spanish;

    @Column(name = "shared_with_cust_date")
    private Date sharedCustDate;

    @Column(name = "seniority", length = 255)
    private String seniority;

    @Column(name = "phone", length = 255)
    private String phone;

    @Lob
    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "resolution_comments")
    private String resolutionComments;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "profile_source", length = 255)
    private String profileSource;

    @Lob
    @Column(name = "candidate_screening_resolution")
    private String candidateScreeningResolution;

    @Column(name = "current_employer", length = 255)
    private String currentEmployer;

    @Column(name = "location", length = 255)
    private String location;

    @Column(name = "salary_intention", length = 255)
    private String salaryIntention;

    @Column(name = "date_update")
    private Date dateUpdate;

    @Column(name = "date_interview")
    private Date dateInterview;

    @Column(name = "date_created") 
    private Date dateCreated;

    @Column(name = "pending_hr")
    private String pendingHR;

    @Column(name = "role")
    private String role;

    @Column(name = "main_skill")
    private String mainSkill;
    
    @Column(name = "rate_target")
    private String rateTarget;

    @Column(name = "dlh_requirement")
    private String dlhRequirement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    public Date getSharedCustDate() {
        return sharedCustDate;
    }

    public void setSharedCustDate(Date sharedCustDate) {
        this.sharedCustDate = sharedCustDate;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResolutionComments() {
        return resolutionComments;
    }

    public void setResolutionComments(String resolutionComments) {
        this.resolutionComments = resolutionComments;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileSource() {
        return profileSource;
    }

    public void setProfileSource(String profileSource) {
        this.profileSource = profileSource;
    }

    public String getCandidateScreeningResolution() {
        return candidateScreeningResolution;
    }

    public void setCandidateScreeningResolution(String candidateScreeningResolution) {
        this.candidateScreeningResolution = candidateScreeningResolution;
    }

    public String getCurrentEmployer() {
        return currentEmployer;
    }

    public void setCurrentEmployer(String currentEmployer) {
        this.currentEmployer = currentEmployer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalaryIntention() {
        return salaryIntention;
    }

    public void setSalaryIntention(String salaryIntention) {
        this.salaryIntention = salaryIntention;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Date getDateInterview() {
        return dateInterview;
    }

    public void setDateInterview(Date dateInterview) {
        this.dateInterview = dateInterview;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPendingHR() {
        return pendingHR;
    }

    public void setPendingHR(String pendingHR) {
        this.pendingHR = pendingHR;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMainSkill() {
        return mainSkill;
    }

    public void setMainSkill(String mainSkill) {
        this.mainSkill = mainSkill;
    }

    public String getRateTarget() {
        return rateTarget;
    }

    public void setRateTarget(String rateTarget) {
        this.rateTarget = rateTarget;
    }

        public String getDlhRequeriment() {
        return dlhRequirement;
    }

    public void setDlhRequeriment(String dlhRequirement) {
        this.dlhRequirement = dlhRequirement;
    }
}
