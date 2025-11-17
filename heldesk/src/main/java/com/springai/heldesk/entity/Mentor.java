package com.springai.heldesk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mentor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int mentor_id;
    private String mentor_name;
    private String skills;
    private String expereince;
    private int assigned_tickets;



    
    @Override
    public String toString() {
        return "Mentor [mentor_id=" + mentor_id + ", mentor_name=" + mentor_name + ", skills=" + skills
                + ", expereince=" + expereince + ", assigned_tickets=" + assigned_tickets + "]";
    }
    public Mentor(int mentor_id, String mentor_name, String skills, String expereince, int assigned_tickets) {
        this.mentor_id = mentor_id;
        this.mentor_name = mentor_name;
        this.skills = skills;
        this.expereince = expereince;
        this.assigned_tickets = assigned_tickets;
    }
    public Mentor() {
    }
    public int getMentor_id() {
        return mentor_id;
    }
    public void setMentor_id(int mentor_id) {
        this.mentor_id = mentor_id;
    }
    public String getMentor_name() {
        return mentor_name;
    }
    public void setMentor_name(String mentor_name) {
        this.mentor_name = mentor_name;
    }
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String getExpereince() {
        return expereince;
    }
    public void setExpereince(String expereince) {
        this.expereince = expereince;
    }
    public int getAssigned_tickets() {
        return assigned_tickets;
    }
    public void setAssigned_tickets(int assigned_tickets) {
        this.assigned_tickets = assigned_tickets;
    } 



}
