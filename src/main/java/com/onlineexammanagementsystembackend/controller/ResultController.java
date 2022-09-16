package com.onlineexammanagementsystembackend.controller;

import com.onlineexammanagementsystembackend.dto.ResultDTO;
import com.onlineexammanagementsystembackend.service.ResultService;
import com.onlineexammanagementsystembackend.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 16/09/2022
 **/

@RestController
@CrossOrigin
public class ResultController {

    @Autowired
    ResultService resultService;

    //to save result
    @PostMapping("/result")
    public ResponseUtil saveResult(@ModelAttribute ResultDTO resultDTO) {
        resultService.saveResult(resultDTO);
        return new ResponseUtil(200, "Save", null);
    }

    //get all result present in database
    @GetMapping("/result")
    public ResponseUtil getAllResults() {
        return new ResponseUtil(200, "Ok", resultService.getAllResults());
    }

    //get all result of a particular student
    @GetMapping("/user/{email}/result")
    public ResponseUtil searchResult(@PathVariable String email) {
        return new ResponseUtil(200, "Ok", resultService.searchResult(email));
    }

}
