package com.springai.heldesk.Service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.springai.heldesk.tools.TicketDatabaseTools;

@Service
public class AIService {

    @Autowired
    private ChatClient chatClient;
    @Autowired
    private TicketDatabaseTools ticketDatabaseTools;

    @Value("classpath:Prompts/ticket-system-prompt.txt")
    private Resource systemResourcePrompt;

    public String getResponseFromAssistant(String query){


        //basic call to LLM
        var response= this.chatClient
        .prompt() 
        .tools(ticketDatabaseTools)
        .system(systemResourcePrompt)
        .user(query)
        .call()
         .chatResponse();   // THIS exists for your version

    return response.getResult().getOutput().getText();

       
    
    }

    
}



