package com.ailabi.consumer.Controller;

import com.ailabi.consumer.Entity.User;
import com.ailabi.consumer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable Long id){
        return restTemplate.getForObject("http://producer/user/getUser/"+id,User.class);
    }
    @GetMapping(value = "/getName")
    public String getName() throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName()+":主线程！");
        Future<String> res = userService.testAsync();
        return res.get();
    }

    @GetMapping(value = "/getNameNew")
    public String getNameNew(){
        String res = userService.getNameNew();
        return res;
    }
}