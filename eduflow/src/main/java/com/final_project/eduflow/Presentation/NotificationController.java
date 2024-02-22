package com.final_project.eduflow.Presentation;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;



// todo
// im dumb send this shit to service layer
@Controller
public class NotificationController {
    private final SimpMessagingTemplate messagingTemplate;

    public NotificationController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendNotification(Long userId, String message) {
        messagingTemplate.convertAndSend("/request/notification" + userId, message);
    }
}
