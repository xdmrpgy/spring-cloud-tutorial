package com.plato.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by Roy Pan
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping("/hi")
    public String sayHi(){
        return schedualServiceHi.sayHiFromClientOne();
    }
}
