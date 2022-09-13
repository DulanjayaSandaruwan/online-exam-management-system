package com.onlineexammanagementsystembackend.service.impl;

import com.onlineexammanagementsystembackend.dto.UserDTO;
import com.onlineexammanagementsystembackend.entity.User;
import com.onlineexammanagementsystembackend.repo.UserRepo;
import com.onlineexammanagementsystembackend.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 13/09/2022
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepo userRepo;

    @Override
    public void saveUser(UserDTO dto) {
        if (!userRepo.existsById(dto.getEmail())) {
            userRepo.save(modelMapper.map(dto, User.class));
        } else {
            throw new RuntimeException("User Already Exist.!");
        }
    }

    @Override
    public UserDTO searchUser(String email) {
        if (userRepo.existsById(email)) {
            return modelMapper.map(userRepo.findById(email), UserDTO.class);
        } else {
            throw new RuntimeException("Search Failed, No User Available For this " + email);
        }
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return modelMapper.map(userRepo.findAll(), new TypeToken<List<UserDTO>>() {
        }.getType());
    }
}
