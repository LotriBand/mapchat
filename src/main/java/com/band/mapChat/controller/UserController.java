package com.band.mapChat.controller;

import com.band.mapChat.model.User;
import com.band.mapChat.service.imple.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("list")
    public String list(Model model,HttpServletRequest request, @RequestParam(defaultValue = "0", required = false) int page){

        model.addAttribute("title","用户管理");
        model.addAttribute("users",userService.getPageList(new PageRequest(page,10)).getContent());
        model.addAttribute("page",userService.getPageList(new PageRequest(page,10)));
        return "user";
    }

    @ResponseBody
    @RequestMapping("lists")
    public Page<User> listJson(HttpServletRequest request, int page){

        return userService.getPageList(new PageRequest(page,10));
    }


    @RequestMapping("toAdd")
    public String toAdd(Model model){
        return "add";
    }


    @RequestMapping("add")
    public String add(User user){
        userService.save(user);
        return "redirect:/user/list";
    }

    @RequestMapping("delete")
    public String add(Long id){
        userService.delete(id);
        return "redirect:/user/list";
    }





}
