package com.onlineexammanagementsystembackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Exam {

    @Id
    private String id;

    @ManyToOne
    private Subject name;

    private String desc;

    private String date;

    private String marks;

    private String totalQuestion;

    private String passMarks;

    private String level;

}
