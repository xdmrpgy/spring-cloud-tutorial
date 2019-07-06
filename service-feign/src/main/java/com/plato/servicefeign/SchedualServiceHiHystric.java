package com.plato.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author by Roy Pan
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne() {
        return "sorry,505";
    }
}
