
package com.fkerich.restapi.resource;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebResource {

    private Logger log = LoggerFactory.getLogger(WebResource.class);
    
    @GetMapping("sleep/{seconds}")
    public void getMethodName(@PathVariable Long seconds) throws InterruptedException {
        log.info("Blocking the thread for {} seconds", seconds);
        Thread.sleep(Duration.ofSeconds(seconds));
        log.info("Thread processing the request is {}", Thread.currentThread().getName());
    }
}
