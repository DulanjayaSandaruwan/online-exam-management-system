package com.onlineexammanagementsystembackend.service;

import com.onlineexammanagementsystembackend.dto.ExamDTO;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

public interface ExamService {

    void saveExam(ExamDTO dto);

    ExamDTO searchExam(String id);

    List<ExamDTO> getAllExams();
}
