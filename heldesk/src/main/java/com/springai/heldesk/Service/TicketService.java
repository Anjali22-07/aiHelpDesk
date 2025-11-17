package com.springai.heldesk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springai.heldesk.Dao.TicketRepository;
import com.springai.heldesk.entity.Ticket;

import jakarta.transaction.Transactional;



@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    //create Ticket
     @Transactional
    public Ticket createTicket(Ticket ticket){
       ticket.setTicketId(null);
        return ticketRepository.save(ticket);
       

      
        
    }

    //update ticket
     @Transactional
    public Ticket updateTicket(Ticket ticket){
         return ticketRepository.save(ticket);
         
    }


    //get Ticket logic by Id

    public Ticket getTicket(Long ticketId){
       return  ticketRepository.findById(ticketId).orElse(null);
    }


    //get ticket by username
     public Ticket  getTicketByEmail(String email){

        return ticketRepository.findByEmail(email);
     }

     //get ticket by Status

     public Ticket getTicketByStatus(String status){
        return ticketRepository.findByStatus(status);
     }

}   

   
