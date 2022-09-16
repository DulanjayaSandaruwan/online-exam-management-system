package com.onlineexammanagementsystembackend.dto;

import com.onlineexammanagementsystembackend.entity.Exam;
import com.onlineexammanagementsystembackend.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.ManyToOne;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 16/09/2022
 **/

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class QuestionDTO {
    private String id;
    private String qname;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private String answer;
    private Subject sname;
    private Exam ename;
}
