package com.example;

//UserController.java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

 @Autowired
 private UserService userService;
 Logger logger = LoggerFactory.getLogger(UserController.class);

 @GetMapping("/users")
 public String showUsers(ModelMap model) {
     logger.info("Getting all users");
     Iterable<User> users = userService.GetAllUsers();
     logger.info("Passing users to view");
     model.addAttribute("users", users);
     return "users";
 }

 @PostMapping("/search")
 public String searchUser(ModelMap model, @RequestParam("id") int id) {
     logger.info("Searching for a user");
     User user = userService.GetUserById(id);
     logger.info("Passing Searched User to View");
     model.addAttribute("userSearch", user);
     return "search";
 }

 @PostMapping("/search/update")
 public String updateUser(ModelMap model, @ModelAttribute("userSearch") User user) {
     logger.info("Updating a User");
     userService.UpdateUser(user);
     model.addAttribute("updatedUser", user);
     return "update";
 }
}
