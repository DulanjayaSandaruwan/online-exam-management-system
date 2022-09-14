package com.onlineexammanagementsystembackend.repo;

import com.onlineexammanagementsystembackend.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 09/09/2022
 **/

public interface AdminRepo extends JpaRepository<Admin, String> {
}
