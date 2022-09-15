package com.onlineexammanagementsystembackend.dto;

import com.onlineexammanagementsystembackend.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ExamDTO {
    private String id;

    private Subject name;

    private String desc;

    private String date;

    private String marks;

    private String totalQuestion;

    private String passMarks;

    private String level;
}
