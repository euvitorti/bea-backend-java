package com.ai.Bea.message.controller;

import com.ai.Bea.message.dto.MessageDTO;
import com.ai.Bea.message.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bea")
public class MessageController {

//    @Autowired
//    private MessageService messageService;

    @PostMapping("/send")
    public ResponseEntity sendMessagePython(@RequestBody MessageDTO messageDTO){

        MessageService messageService = new MessageService();
        var result = messageService.sendMessageToPythonApi(messageDTO.message());

        return ResponseEntity.ok().body(result);
    }
}
