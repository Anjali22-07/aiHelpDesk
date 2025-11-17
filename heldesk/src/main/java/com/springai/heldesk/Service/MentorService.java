package com.springai.heldesk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springai.heldesk.Dao.MentorRepository;
import com.springai.heldesk.entity.Mentor;

@Service
public class MentorService {

    @Autowired
    private MentorRepository mentorRepository;
    
    public Mentor getByCategory(String Category){

       return mentorRepository.findByCategory(Category).orElseThrow(()-> new RuntimeException("No mentor available for category"+ Category));

    }

     // Increment the assigned tickets count
    public Mentor incrementAssignedTickets(Mentor mentor){
        mentor.setAssigned_tickets(mentor.getAssigned_tickets()+1);
        return mentorRepository.save(mentor);   //updates the database when you call save()
    }

}
