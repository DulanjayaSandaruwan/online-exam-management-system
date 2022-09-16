package com.onlineexammanagementsystembackend.dto;

import com.onlineexammanagementsystembackend.entity.Exam;
import com.onlineexammanagementsystembackend.entity.Subject;
import com.onlineexammanagementsystembackend.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 16/09/2022
 **/

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ResultDTO {

    private String id;

    private String status;

    private String score;

    private String edate;

    private String totalMarks;

    private String totalQuestion;

    private Subject sname;

    private User email;

    private Exam examId;

}
