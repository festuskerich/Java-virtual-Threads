package com.fkerich.application.resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/")
public class WebResource {

    private Logger log = LoggerFactory.getLogger(WebResource.class);

    private final RestClient restClient;
    public WebResource(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("http://localhost:8066")
                .build();
    }

    @GetMapping("virtual-thread")
    public void getMethodName() {
        log.info("New request +++++++++++++++++++++++++++++++++++++++++++++++++");
        restClient.get()
        .uri("/sleep/3")
        .retrieve()
        .toBodilessEntity();
    }
}
