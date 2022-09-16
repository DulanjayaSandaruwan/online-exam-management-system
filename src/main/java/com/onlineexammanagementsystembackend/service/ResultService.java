package com.onlineexammanagementsystembackend.service;

import com.onlineexammanagementsystembackend.dto.ResultDTO;
import com.onlineexammanagementsystembackend.dto.UserDTO;

import java.util.List;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 16/09/2022
 **/
public interface ResultService {

    void saveResult(ResultDTO dto);
    ResultDTO searchResult(String id);
    List<ResultDTO> getAllResults();

}
