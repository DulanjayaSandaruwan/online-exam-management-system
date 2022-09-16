package com.onlineexammanagementsystembackend.service;

import com.onlineexammanagementsystembackend.dto.QuestionDTO;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 16/09/2022
 **/
public interface QuestionService {
    void saveQuestion(QuestionDTO dto);
    void deleteQuestion(String id);
    void updateQuestion(QuestionDTO dto);
    QuestionDTO searchQuestion(String id);
    List<QuestionDTO> getAllQuestions();
}
