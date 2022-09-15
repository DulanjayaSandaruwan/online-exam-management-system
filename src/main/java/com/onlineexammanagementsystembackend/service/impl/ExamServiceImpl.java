package com.onlineexammanagementsystembackend.service.impl;

import com.onlineexammanagementsystembackend.dto.ExamDTO;
import com.onlineexammanagementsystembackend.entity.Exam;
import com.onlineexammanagementsystembackend.repo.ExamRepo;
import com.onlineexammanagementsystembackend.service.ExamService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ExamRepo examRepo;

    @Override
    public void saveExam(ExamDTO dto) {
        if(!examRepo.existsById(dto.getId())){
            examRepo.save(modelMapper.map(dto, Exam.class));
        } else {
            throw new RuntimeException("Exam Already Exist.!");
        }
    }

    @Override
    public ExamDTO searchExam(String id) {
        if (examRepo.existsById(id)){
            return modelMapper.map(examRepo.findById(id), ExamDTO.class);
        } else {
            throw new RuntimeException("Search Failed, No Exam Available For " + id);
        }
    }

    @Override
    public List<ExamDTO> getAllExams() {
        return modelMapper.map(examRepo.findAll(), new TypeToken<List<ExamDTO>>(){
        }.getType());
    }
}
