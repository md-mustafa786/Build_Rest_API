package com.example.BuildRESTAPIs.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserModels {
    @Id
    private  Integer id;
    private String username;
    private String password;
}
