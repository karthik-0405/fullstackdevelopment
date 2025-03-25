package com.example.FSD_Api.repository;
import com.example.FSD_Api.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserModel, Long>  {
}
