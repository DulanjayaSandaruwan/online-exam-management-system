package com.onlineexammanagementsystembackend.service;

import com.onlineexammanagementsystembackend.dto.UserDTO;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 13/09/2022
 **/

public interface UserService {
    void saveUser(UserDTO dto);
    UserDTO searchUser(String email);
    List<UserDTO> getAllUsers();
}
