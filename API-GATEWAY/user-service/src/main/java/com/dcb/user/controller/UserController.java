package com.dcb.user.controller;

import com.dcb.user.VO.ResponseTemplateVO;
import com.dcb.user.entity.User;
import com.dcb.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId){
        System.out.println("user id: " + userId);
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();

        try {
            responseTemplateVO = userService.getUserWithDepartment(userId);

        } catch (Exception e) {
            System.out.println("Exception: " +e);
        }

        System.out.println(responseTemplateVO);
        return responseTemplateVO;
    }

    /*@GetMapping("/dept/{userId}")
    public User findDepartmentById(@PathVariable("userId") Long userId){
        //log.info("Inside findDepartmentById of DepartmentController");
        return userService.findByUserId(userId);
    }*/
}
