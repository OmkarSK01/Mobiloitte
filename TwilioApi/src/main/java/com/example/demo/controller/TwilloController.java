package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MessageModel;
import com.example.demo.service.TwilloMessageSenderService;


@RestController
@RequestMapping("/twillo")
public class TwilloController {
	@Autowired
    private TwilloMessageSenderService twilloService;
     
    @PostMapping("/sendSMS")
    public String sendSMSByTwillo(@RequestBody MessageModel messageRequest) {
        String sendMessageResponse = twilloService.sendMessage(messageRequest);
        return sendMessageResponse;
    }

}
