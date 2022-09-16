package com.onlineexammanagementsystembackend.repo;

import com.onlineexammanagementsystembackend.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 16/09/2022
 **/
public interface QuestionRepo extends JpaRepository<Question, String> {
}
