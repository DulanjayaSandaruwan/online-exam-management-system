package com.onlineexammanagementsystembackend.controller;

import com.onlineexammanagementsystembackend.entity.Admin;
import com.onlineexammanagementsystembackend.service.AdminService;
import com.onlineexammanagementsystembackend.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 10/09/2022
 **/

@RestController
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;

    // get admin detail by admin_name
    @GetMapping(path = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchAdmin(@PathVariable String name){
        return new ResponseUtil(200,"Ok", adminService.searchAdmin(name));
    }

}
