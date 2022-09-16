package com.onlineexammanagementsystembackend.service.impl;

import com.onlineexammanagementsystembackend.dto.QuestionDTO;
import com.onlineexammanagementsystembackend.entity.Question;
import com.onlineexammanagementsystembackend.repo.QuestionRepo;
import com.onlineexammanagementsystembackend.service.QuestionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 16/09/2022
 **/

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private QuestionRepo questionRepo;

    @Override
    public void saveQuestion(QuestionDTO dto) {
        if (!questionRepo.existsById(dto.getId())) {
            questionRepo.save(modelMapper.map(dto, Question.class));
        } else {
            throw new RuntimeException("Question Already Exist.!");
        }
    }

    @Override
    public void deleteQuestion(String id) {
        if (questionRepo.existsById(id)) {
            questionRepo.deleteById(id);
        } else {
            throw new RuntimeException("Delete Failed, No Question Available For " + id);
        }
    }

    @Override
    public void updateQuestion(QuestionDTO dto) {
        if (questionRepo.existsById(dto.getId())) {
            questionRepo.save(modelMapper.map(dto, Question.class));
        } else {
            throw new RuntimeException("Update Failed, No Question Available For " + dto.getId());
        }
    }

    @Override
    public QuestionDTO searchQuestion(String id) {
        if (questionRepo.existsById(id)) {
            return modelMapper.map(questionRepo.findById(id), QuestionDTO.class);
        } else {
            throw new RuntimeException("Search Failed, No Question Available For " + id);
        }
    }

    @Override
    public List<QuestionDTO> getAllQuestions() {
        return modelMapper.map(questionRepo.findAll(), new TypeToken<List<QuestionDTO>>() {
        }.getType());
    }
}
