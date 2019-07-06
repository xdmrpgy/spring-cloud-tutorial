package com.plato.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by Roy Pan
 */
@RestController
public class HelloWorldController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String sayHi(){
        return "hi:" + port;
    }
}
