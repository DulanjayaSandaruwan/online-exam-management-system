package com.onlineexammanagementsystembackend.service.impl;

import com.onlineexammanagementsystembackend.dto.ResultDTO;
import com.onlineexammanagementsystembackend.entity.Result;
import com.onlineexammanagementsystembackend.repo.ResultRepo;
import com.onlineexammanagementsystembackend.service.ResultService;
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
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ResultRepo resultRepo;

    @Override
    public void saveResult(ResultDTO dto) {
        if (!resultRepo.existsById(dto.getId())) {
            resultRepo.save(modelMapper.map(dto, Result.class));
        } else {
            throw new RuntimeException("Result Already Exist.!");
        }
    }

    @Override
    public ResultDTO searchResult(String id) {
        if (resultRepo.existsById(id)) {
            return modelMapper.map(resultRepo.findById(id), ResultDTO.class);
        } else {
            throw new RuntimeException("Search Failed, No Result Available For " + id);
        }
    }

    @Override
    public List<ResultDTO> getAllResults() {
        return modelMapper.map(resultRepo.findAll(), new TypeToken<List<ResultDTO>>() {
        }.getType());
    }
}
