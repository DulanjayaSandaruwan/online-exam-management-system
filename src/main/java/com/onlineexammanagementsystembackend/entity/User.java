package com.onlineexammanagementsystembackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 13/09/2022
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {
    private String name;
    @Id
    private String email;
    private String password;
}
