package org.motechproject.helloworld.event.listener;

import org.motechproject.event.MotechEvent;
import org.motechproject.event.listener.annotations.MotechListener;
import org.motechproject.helloworld.EventKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @MotechListener(subjects = { EventKeys.CUSTOM_SUBJECT })
    public void handleEvent(MotechEvent event) {
        String message = "Handled an event with subject " + event.getSubject();
        logger.info(message);
    }
}