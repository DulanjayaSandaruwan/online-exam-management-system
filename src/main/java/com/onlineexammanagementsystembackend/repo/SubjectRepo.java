package com.onlineexammanagementsystembackend.repo;

import com.onlineexammanagementsystembackend.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 14/09/2022
 **/

public interface SubjectRepo extends JpaRepository<Subject, String> {
}
