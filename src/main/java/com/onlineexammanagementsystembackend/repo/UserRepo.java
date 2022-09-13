package com.onlineexammanagementsystembackend.repo;

import com.onlineexammanagementsystembackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @since : 13/09/2022
 **/
public interface UserRepo extends JpaRepository<User, String> {
}
