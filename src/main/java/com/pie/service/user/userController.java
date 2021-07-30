package com.pie.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Persistent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.nio.file.Files;

@RequiredArgsConstructor
@RestController
public class userController {

    @PersistenceContext
    private final EntityManager em;


    @GetMapping(path = "/findName/{id}")
    public String userId(@PathVariable String id) {
        try {
            User findUser = em.find(User.class, id);
            return findUser.getName();
        } catch(Exception e) {
            return "not exist";
        }
    }

    @Transactional
    @GetMapping(path = "/setUser/{id}/{name}/{attend}/{password}")
    public User setUser(@PathVariable String id, @PathVariable String name,
                          @PathVariable String attend, @PathVariable String password) {
       try {
           User user = new User();
           user.setId(id);
           user.setName(name);
           user.setAttend(attend);
           user.setPassword(password);
           em.persist(user);
           return user;
       } catch (Exception e) {
           return new User();
       }

    }

    @Transactional
    @GetMapping(path="/resetId/{id}")
    public User resetId(@PathVariable String id) {
        try {
            User changeUser = em.find(User.class, "test");
            changeUser.setName(id);
            return changeUser;
        } catch (Exception e) {
            System.out.println(e);
            return new User();
        }
    }


}
