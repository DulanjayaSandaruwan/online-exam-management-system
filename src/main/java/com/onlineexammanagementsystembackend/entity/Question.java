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
 * @since : 16/09/2022
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Question {

    @Id
    private String id;
    private String qname;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private String answer;
    @ManyToOne
    private Subject sname;
    @ManyToOne
    private Exam ename;
}
