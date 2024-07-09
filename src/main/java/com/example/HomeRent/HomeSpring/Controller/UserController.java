package com.example.HomeRent.HomeSpring.Controller;

import com.example.HomeRent.HomeSpring.Entity.User;
import com.example.HomeRent.HomeSpring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

   @Autowired
    private UserService userService;

   @GetMapping
    public List<User> getAllUsers(){
       return userService.getAllUsers() ;
   }
   @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
       return userService.getUserById(id);
   }
   @PostMapping
    public  User createUser(@RequestBody User user){
      return userService.saveUser(user) ;
   }
   @DeleteMapping("/{id}")
   public void deleteUser(@PathVariable Long id){

       userService.deleteUser(id);
   }

}
