package com.onlineexammanagementsystembackend.controller;

import com.onlineexammanagementsystembackend.dto.ExamDTO;
import com.onlineexammanagementsystembackend.dto.SubjectDTO;
import com.onlineexammanagementsystembackend.service.ExamService;
import com.onlineexammanagementsystembackend.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

@RestController
@CrossOrigin
public class ExamController {

    @Autowired
    ExamService examService;

    //to add a new exam
    @PostMapping("/exam")
    public ResponseUtil saveExam(@ModelAttribute ExamDTO examDTO) {
        examService.saveExam(examDTO);
        return new ResponseUtil(200, "Save", null);
    }

    // to get all exam
    @GetMapping("/exam")
    public ResponseUtil getAllExams() {
        return new ResponseUtil(200, "Ok", examService.getAllExams());
    }

    //to get details of a particular exam
    @GetMapping("/exam/{id}")
    public ResponseUtil searchExam(@PathVariable String id) {
        return new ResponseUtil(200, "Ok", examService.searchExam(id));
    }

}
