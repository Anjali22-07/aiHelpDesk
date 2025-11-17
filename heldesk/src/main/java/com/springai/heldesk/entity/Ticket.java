package com.springai.heldesk.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ticketId;
     @Lob
    private String summary;
    @Enumerated(EnumType.STRING)
    private Priority priority;
      private  String category;
    @Column(length = 1000)
    private  String description;
    @Column(unique = true)
    private String email;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    @ManyToOne
    @JoinColumn(name="mentor_id")
    private Mentor mentor;
    @Enumerated(EnumType.STRING)
    private Status status;




    
    @Override
    public String toString() {
        return "Ticket [ticketId=" + ticketId + ", summary=" + summary + ", priority=" + priority + ", category="
                + category + ", description=" + description +  ", email=" + email
                + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", mentor=" + mentor + ", status=" + status
                + "]";
    }

    public Ticket() {
    }

    public Ticket(Long ticketId, String summary, Priority priority, String category, String description, 
            String email, LocalDateTime createdOn, LocalDateTime updatedOn, Mentor mentor, Status status) {
        this.ticketId = ticketId;
        this.summary = summary;
        this.priority = priority;
        this.category = category;
        this.description = description;
        this.email = email;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.mentor = mentor;
        this.status = status;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Status getStatus() {
        return status;
    }   

    public void setStatus(Status status) {
        this.status = status;
    }

    @PrePersist
    void preSave(){       
        if(this.createdOn==null){
            this.createdOn=LocalDateTime.now(); //When a new ticket is created → set timestamp.If the user already passed a createdOn value → keep it
        
        }
        this.updatedOn=LocalDateTime.now(); //Every time a new entity is saved, updatedOn gets the current time.This keeps track of last updated timestamp.
       
    }

    @PreUpdate
    void preUpdate(){
        this.updatedOn=LocalDateTime.now(); //updates  the Updatedon automatically
    }

    




}
