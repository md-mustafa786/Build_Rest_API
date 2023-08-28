package com.example.BuildRESTAPIs.controllers;

import com.example.BuildRESTAPIs.models.UserModels;
import com.example.BuildRESTAPIs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    ResponseEntity<String> addUser(@RequestBody UserModels user){
        userService.add(user);
        return new ResponseEntity<>("user added sucsessfully", HttpStatus.CREATED);
    }

    @GetMapping("/read")
       public List<UserModels> getAll(){
        return userService.getAll();
    }

    @PutMapping("update")
    ResponseEntity<String> update(@RequestBody UserModels newUser, @RequestParam Integer id){
        userService.update(newUser,id);
        return new ResponseEntity<>("updated",HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        userService.delete(id);
        return  new ResponseEntity<>("deleted",HttpStatus.OK);
    }

    @DeleteMapping("/deleteAll")
  public ResponseEntity<String> deleteAll(){ userService.deleteAll();return new ResponseEntity<>("deleted",HttpStatus.OK);}
}








