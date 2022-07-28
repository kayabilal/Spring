package com.bilal.kaya.springboot.api;

import com.bilal.kaya.springboot.dto.UserDto;
import com.bilal.kaya.springboot.entity.User;
import com.bilal.kaya.springboot.service.UserService;
import com.bilal.kaya.springboot.util.CustomPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    /*@Autowired
    private UserService userService;*/
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        UserDto resultUser=userService.createUser(user);
        return ResponseEntity.ok(resultUser);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<UserDto>> getUser(){
        List<UserDto> users =userService.getUsers();
        return ResponseEntity.ok(users);

    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id")  Long id){

        UserDto user=userService.getUser(id);
        return ResponseEntity.ok(user);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id,@RequestBody UserDto user){
        UserDto resultUser=userService.updateUser(id,user);
        return ResponseEntity.ok(resultUser);
    }
    @GetMapping("/pagination")
    public ResponseEntity<Page<User>> pagination(@RequestParam int currentPage,@RequestParam int pageSize){
        return ResponseEntity.ok(userService.pagination(currentPage,pageSize));
    }
    @GetMapping("/pagination/v1")
    public ResponseEntity<Page<User>> pagination(Pageable pageable){
        return ResponseEntity.ok(userService.pagination(pageable));
    }
    @GetMapping("/pagination/v2")
    public ResponseEntity<Slice<User>> slice(Pageable pageable){
        return ResponseEntity.ok(userService.pagination(pageable));
    }
    @GetMapping("/pagination/v3")
    public ResponseEntity<CustomPage<UserDto>> customPagination(Pageable pageable){
        return ResponseEntity.ok(userService.customPagination(pageable));
    }
}
