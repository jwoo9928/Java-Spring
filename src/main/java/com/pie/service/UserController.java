package com.pie.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //Get
    //@RequestMapping(method=RequestMethod.GET,path"/userId")
    @GetMapping(path="/userId")
    public String userId() {
        return "001";
    }
}
