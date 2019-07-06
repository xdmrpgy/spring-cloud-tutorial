package com.plato.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHiFromClientOne();
}
