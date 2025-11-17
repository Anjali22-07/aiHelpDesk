package com.springai.heldesk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springai.heldesk.Service.AIService;



@RestController
@RequestMapping("/api/a1/v1/")
public class AIController {

    @Autowired
    private AIService aiService;

    @PostMapping("/response")
    public ResponseEntity<String> getResponse(@RequestBody String query){

        return ResponseEntity.ok(aiService.getResponseFromAssistant(query));
    }
}
