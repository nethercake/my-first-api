package com.example.myfirstapi.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {


    @GetMapping("/messages/{content}")
    Message getMessage(@PathVariable String content){
        return Message.builder().content(content).build();
    }

}
