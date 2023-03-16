package com.multicampus.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {
    @GetMapping
    public void hello(){
        log.info("hello nive meet you . spring-mvc");
    }
}
