package com.ai.Bea.message.controller;

import com.ai.Bea.message.dto.MessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bea")
public class MessageController {

    @PostMapping("/send")
    public ResponseEntity sendMessagePython(@RequestBody MessageDTO messageDTO){

    return ResponseEntity.ok().body("Done!");
    }
}
