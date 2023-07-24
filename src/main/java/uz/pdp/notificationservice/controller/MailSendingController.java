package uz.pdp.notificationservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.pdp.notificationservice.controller.dto.MailDto;
import uz.pdp.notificationservice.service.MailSendingService;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class MailSendingController {

    private final MailSendingService mailSendingService;

    @PostMapping("/send-single")
    public void sendMessage(@RequestBody MailDto mailDto){
        mailSendingService.sendMessage(mailDto);
    }
}
