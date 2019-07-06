package com.plato.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author by Roy Pan
 */
@Service
public class HiService {
    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError")
    public String callHi(){
        return restTemplate.getForObject("http://eureka-client/hi",String.class);
    }

    public String hiError(){
        return "sorry,something is wrong!";
    }
}
