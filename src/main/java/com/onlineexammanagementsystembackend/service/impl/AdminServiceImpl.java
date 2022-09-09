package com.onlineexammanagementsystembackend.service.impl;

import com.onlineexammanagementsystembackend.dto.AdminDTO;
import com.onlineexammanagementsystembackend.repo.AdminRepo;
import com.onlineexammanagementsystembackend.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 09/09/2022
 **/

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public AdminDTO searchAdmin(String name) {
        if (adminRepo.existsById(name)) {
            return modelMapper.map(adminRepo.findById(name).get(), AdminDTO.class);
        } else {
            throw new RuntimeException("No Customer For " + name + " ..!");
        }
    }
}
