package com.onlineexammanagementsystembackend.controller;

import com.onlineexammanagementsystembackend.dto.UserDTO;
import com.onlineexammanagementsystembackend.service.UserService;
import com.onlineexammanagementsystembackend.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 13/09/2022
 **/

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    // to add a new user
    @PostMapping("/user")
    public ResponseUtil saveItem(@ModelAttribute UserDTO userDTO) {
        userService.saveUser(userDTO);
        return new ResponseUtil(200, "Save", null);
    }

    // get all user
    @GetMapping("/user")
    public ResponseUtil getAllUsers() {
        return new ResponseUtil(200, "Ok", userService.getAllUsers());
    }

    // get user detail by its email
    @GetMapping("/user/{email}")
    public ResponseUtil searchUser(@PathVariable String email) {
        return new ResponseUtil(200, "Ok", userService.searchUser(email));
    }
}
