package com.onlineexammanagementsystembackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 13/09/2022
 **/

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class UserDTO {
    private String name;
    private String email;
    private String password;
}
