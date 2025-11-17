package com.springai.heldesk.Dao;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import com.springai.heldesk.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Long>{

    Ticket findByTicketId(Long ticketId);
    Ticket findByEmail(String email);
    Ticket findByStatus(String Status);

}
