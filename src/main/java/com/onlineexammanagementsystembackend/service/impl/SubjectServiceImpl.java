package com.onlineexammanagementsystembackend.service.impl;

import com.onlineexammanagementsystembackend.dto.SubjectDTO;
import com.onlineexammanagementsystembackend.entity.Subject;
import com.onlineexammanagementsystembackend.repo.SubjectRepo;
import com.onlineexammanagementsystembackend.service.SubjectService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public void saveSubject(SubjectDTO dto) {
        if (!subjectRepo.existsById(dto.getName())) {
            subjectRepo.save(modelMapper.map(dto, Subject.class));
        } else {
            throw new RuntimeException("Subject Already Exist.!");
        }
    }

    @Override
    public void deleteSubject(String name) {
        if (subjectRepo.existsById(name)) {
            subjectRepo.deleteById(name);
        } else {
            throw new RuntimeException("Please check the subject name.No Such subject.!");
        }
    }

    @Override
    public List<SubjectDTO> getAllSubjects() {
        return modelMapper.map(subjectRepo.findAll(), new TypeToken<List<SubjectDTO>>() {
        }.getType());
    }
}
