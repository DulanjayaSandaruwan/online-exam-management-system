package com.onlineexammanagementsystembackend.controller;

import com.onlineexammanagementsystembackend.dto.QuestionDTO;
import com.onlineexammanagementsystembackend.dto.UserDTO;
import com.onlineexammanagementsystembackend.entity.Question;
import com.onlineexammanagementsystembackend.service.QuestionService;
import com.onlineexammanagementsystembackend.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 16/09/2022
 **/

@RestController
@CrossOrigin
public class QuestionController {

    @Autowired
    QuestionService questionService;

    //add a question in a particular exam
    @PostMapping("/question")
    public ResponseUtil saveQuestion(@ModelAttribute QuestionDTO questionDTO) {
        questionService.saveQuestion(questionDTO);
        return new ResponseUtil(200, "Save", null);
    }

    //update a question in a particular exam
    @PutMapping("/question/{id}")
    public ResponseUtil updateQuestion(@RequestBody QuestionDTO questionDTO) {
        questionService.updateQuestion(questionDTO);
        return new ResponseUtil(200,"Updated",null);
    }

    // delete a question in a particular exam
    @DeleteMapping("/question/{id}")
    public ResponseUtil deleteQuestion(@PathVariable String id) {
        questionService.deleteQuestion(id);
        return new ResponseUtil(200, "Deleted", null);
    }

    //to show all question present in database
    @GetMapping("/question")
    public ResponseUtil getAllQuestions() {
        return new ResponseUtil(200, "Ok", questionService.getAllQuestions());
    }

    //to get details of all question of that particular exam(of course using exam_id)
    @GetMapping("/exam/{id}/question")
    public ResponseUtil searchQuestion(@PathVariable String id) {
        return new ResponseUtil(200, "Ok", questionService.searchQuestion(id));
    }

}
