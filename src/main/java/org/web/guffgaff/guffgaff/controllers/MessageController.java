package org.web.guffgaff.guffgaff.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import org.web.guffgaff.guffgaff.dto.MessageDTO;

@RestController
public class MessageController {

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public MessageDTO sendMessage(MessageDTO message) {
        return message;
    }
}
