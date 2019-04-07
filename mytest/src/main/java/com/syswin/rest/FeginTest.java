package com.syswin.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "bbb",fallback =FeginTestImpl.class)
public interface FeginTest {

    @RequestMapping("hello")
    public String getResult();

}
