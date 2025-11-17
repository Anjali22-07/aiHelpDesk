package com.springai.heldesk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springai.heldesk.Service.TicketService;
import com.springai.heldesk.entity.Priority;
import com.springai.heldesk.entity.Status;
import com.springai.heldesk.entity.Ticket;
import com.springai.heldesk.tools.TicketDatabaseTools;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class HeldeskApplication {
 
	//   @Autowired
    // private TicketDatabaseTools ticketTool;
	public static void main(String[] args) {
		SpringApplication.run(HeldeskApplication.class, args);
	}

	//  @PostConstruct
    // public void testSaveTicket() {
    //     Ticket ticket = new Ticket();
    //     ticket.setEmail("ekansh@gmail.com");
    //     ticket.setSummary("Test ticket");
    //     ticket.setDescription("Testing ticket creation manually");
    //     ticket.setPriority(Priority.HIGH);
    //     ticket.setStatus(Status.OPEN);

    //     Ticket saved = ticketTool.createTicket(ticket);
    //     System.out.println("Saved ticket: " + saved);
    // }
}
