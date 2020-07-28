package com.ginger.web.controller;

import com.ginger.domain.User;
import com.ginger.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/user")

public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    public @ResponseBody List<User> findAll(){
        return userService.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public @ResponseBody User findById(Integer id){
        return userService.findById(id);
    }

    /**
     * 更新
     * @param user
     */
    @RequestMapping("/updateUser")
    public @ResponseBody void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
