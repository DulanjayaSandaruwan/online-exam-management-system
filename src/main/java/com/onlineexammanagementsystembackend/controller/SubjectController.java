package com.onlineexammanagementsystembackend.controller;

import com.onlineexammanagementsystembackend.dto.SubjectDTO;
import com.onlineexammanagementsystembackend.service.SubjectService;
import com.onlineexammanagementsystembackend.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

@RestController
@CrossOrigin
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    //to add a new subject
    @PostMapping("/subject")
    public ResponseUtil saveSubject(@ModelAttribute SubjectDTO subjectDTO) {
        subjectService.saveSubject(subjectDTO);
        return new ResponseUtil(200, "Save", null);
    }

    //to add a new subject
    @DeleteMapping("/subject/{name}")
    public ResponseUtil deleteSubject(@PathVariable String name) {
        subjectService.deleteSubject(name);
        return new ResponseUtil(200, "Deleted", null);
    }

    // get all user
    @GetMapping("/subject")
    public ResponseUtil getAllSubjects() {
        return new ResponseUtil(200, "Ok", subjectService.getAllSubjects());
    }

}
