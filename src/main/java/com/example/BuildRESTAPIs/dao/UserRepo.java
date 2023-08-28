package com.example.BuildRESTAPIs.dao;

import com.example.BuildRESTAPIs.models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModels,Integer> {
}
