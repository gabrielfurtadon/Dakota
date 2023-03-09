package com.tcs.dakotadb.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "open_position") // Vagas Abertas
public class OpenPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // Formulário HTML
    @Column(name = "title")
    private String title;
    @Column(name = "priority")
    private String priority;
    @Column(name = "seniority")
    private String seniority;
    @Column(name = "new_position_or_replacement")
    private String newPositionOrReplacement;
    @Column(name = "minimun_experience_years")
    private int minimumExperienceYears;
    @Column(name = "cluster")
    private String cluster;
    @Column(name = "rgs_status") // ---
    private String rgsStatus;
    @Column(name = "work_model")
    private String workModel;
    @Column(name = "position_status")
    private String positionStatus;
    @Column(name = "english")
    private String english;
    @Column(name = "spanish")
    private String spanish;
    @Column(name = "cloud_skill")
    private String cloudSkill;
    @Column(name = "description")
    private String description;
    @Column(name = "linkedin_url")
    private String linkedinUrl;
    @Column(name = "customer")
    private String customer;
    @Column(name = "work_location")
    private String worklocation;
    @Column(name = "need_client_interview")
    private String needClientInterview;
    @Column(name = "date_created")
    private Date dateCreated;
    @Column(name = "cancel_reason") // ---
    private String cancelReason;
    @Column(name = "won")
    private String won;
    @Column(name = "on_hold")
    private String onHold;
    @Column(name = "vacancies")
    private int vacancies;
    @Column(name = "customer_area")
    private String customerArea;

    @ManyToOne
    @JoinColumn(name = "tcs_id")
    private User user;

    // Getters e Setters
    // ------------------------------------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // ------------------------------------------------
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // ------------------------------------------------
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    // ------------------------------------------------
    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    // ------------------------------------------------
    public int getVacancies() {
        return vacancies;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }

    // ------------------------------------------------
    public String getNewPositionOrReplacement() {
        return newPositionOrReplacement;
    }

    public void setNewPositionOrReplacement(String newPositionOrReplacement) {
        this.newPositionOrReplacement = newPositionOrReplacement;
    }

    // ------------------------------------------------
    public int getMinimumExperienceYears() {
        return minimumExperienceYears;
    }

    public void setMinimumExperienceYears(int minimumExperienceYears) {
        this.minimumExperienceYears = minimumExperienceYears;
    }

    // ------------------------------------------------
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    // ------------------------------------------------
    public String getRgsStatus() {
        return rgsStatus;
    }

    public void setRgsStatus(String rgsStatus) {
        this.rgsStatus = rgsStatus;
    }

    // ------------------------------------------------
    public String getWorkModel() {
        return workModel;
    }

    public void setWorkModel(String workModel) {
        this.workModel = workModel;
    }

    // ------------------------------------------------
    public String getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(String positionStatus) {
        this.positionStatus = positionStatus;
    }

    // ------------------------------------------------
    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    // ------------------------------------------------
    public String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    // ------------------------------------------------
    public String getCloudSkill() {
        return cloudSkill;
    }

    public void setCloudSkill(String cloudSkill) {
        this.cloudSkill = cloudSkill;
    }

    // ------------------------------------------------
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // ------------------------------------------------
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    // ------------------------------------------------
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    // ------------------------------------------------
    public String getCustomerArea() {
        return customerArea;
    }

    public void setCustomerArea(String customerArea) {
        this.customerArea = customerArea;
    }

    // ------------------------------------------------
    public String getWorklocation() {
        return worklocation;
    }

    public void setWorklocation(String worklocation) {
        this.worklocation = worklocation;
    }

    // ------------------------------------------------
    public String getNeedClientInterview() {
        return needClientInterview;
    }

    public void setNeedClientInterview(String needClientInterview) {
        this.needClientInterview = needClientInterview;
    }

    // ------------------------------------------------
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    // ------------------------------------------------
    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    // ------------------------------------------------
    public String getWon() {
        return won;
    }

    public void setWon(String won) {
        this.won = won;
    }

    // ------------------------------------------------
    public String getOnHold() {
        return onHold;
    }

    public void setOnHold(String onHold) {
        this.onHold = onHold;
    }

    // ------------------------------------------------
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
