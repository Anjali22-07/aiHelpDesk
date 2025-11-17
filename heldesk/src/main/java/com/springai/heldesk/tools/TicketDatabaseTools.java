package com.springai.heldesk.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springai.heldesk.Service.TicketService;
import com.springai.heldesk.entity.Ticket;

@Component
public class TicketDatabaseTools {

    @Autowired
    private TicketService ticketService;

    //create Tools

     @Tool(description = "This tool is used for ticket creation")
     public Ticket createToolTicket(@ToolParam(description = "new Ticket Creation tool")Ticket ticket){
      try {

         System.out.println("Going to create ticket");
         System.out.println(ticket);
         return this.ticketService.createTicket(ticket);
         
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
         return null;
      }
        
     }

     //tool to get ticket by the username

     @Tool(description = "This tool gets the ticket by username ")
     public Ticket getToolTicketByEmail(@ToolParam(description = "username who's ticket is asked") String email){

        return this.ticketService.getTicketByEmail(email);

     }

     //update ticket

     @Tool(description = "This tool helps to update ticket")
     public Ticket updateToolTicket(@ToolParam(description = "New ticket with the old ticket Id")Ticket ticket){
        return this.ticketService.updateTicket(ticket);
     }

     //get current system time

     @Tool(description = "This tool gets current System Time")
     public String getCurrentTime(){

        return String.valueOf(System.currentTimeMillis());
     }
}
