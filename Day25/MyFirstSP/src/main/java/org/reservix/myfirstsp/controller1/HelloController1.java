package org.reservix.myfirstsp.controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController1 {

    @GetMapping("/hello1")
    public String hello1(){
        return "hello i am shareef";
    }
}
