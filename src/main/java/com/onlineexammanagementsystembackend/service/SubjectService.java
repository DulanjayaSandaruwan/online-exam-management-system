package com.onlineexammanagementsystembackend.service;

import com.onlineexammanagementsystembackend.dto.SubjectDTO;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

public interface SubjectService {

    void saveSubject(SubjectDTO dto);
    void deleteSubject(String code);
    List<SubjectDTO> getAllSubjects();
}
