package org.motechproject.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import org.motechproject.helloworld.event.EventEmitter;

@Controller
public class EventEmitterController {

    @Autowired
    private EventEmitter eventEmitter;

    @RequestMapping("/event-emitter")
    @ResponseBody
    public String emitEvent() {
        eventEmitter.emitEvent();
        String message = "Will emit an event with subject " + eventEmitter.getSubject();
        return message;
    }

    @RequestMapping("/custom-emitter")
    @ResponseBody
    public String emitCustomEvent() {
        eventEmitter.emitCustomEvent();
        return "Emitted custom event.";
    }
}