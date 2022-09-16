package com.onlineexammanagementsystembackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Result {


    @Id
    private String id;

    private String status;

    private String score;

    private String edate;

    private String totalMarks;

    private String totalQuestion;

    @ManyToOne
    @JoinColumn(name= "exam_name")
    private Subject sname;

    @ManyToOne
    @JoinColumn(name= "user_email")
    private User email;

    @ManyToOne
    @JoinColumn(name= "exam_id")
    private Exam examId;

}
