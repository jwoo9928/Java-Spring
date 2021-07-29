package com.pie.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //Get
    //@RequestMapping(method=RequestMethod.GET,path"/userId")
    @GetMapping(path="/userId")
    public String userId() {
        System.out.println("output of user Id");
        return "001";
    }

    @GetMapping(path="/userId-bean")
    public userIdBean userIdBean() {
        return new userIdBean("001");
    }

    @GetMapping(path="userInfo/{id}")
    public userIdBean userInfo(@PathVariable String id) {
        return new userIdBean(id);
    }

}
