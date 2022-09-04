package com.example.myproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService jpaUserService;

    @Autowired
    UserService2 userService2;

    /**
     * 新增用户
     */
    @PostMapping("")
    public void addUser(@RequestBody UserDto user){userService2.insert(user);}
    /**
     * 删除用户
     */
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        jpaUserService.deleteUser(id);
    }

    /**
     * 修改用户
     */
    @PutMapping("")
    public User updateUser(@RequestBody User user){
        return jpaUserService.updateUser(user);
    }

    /**
     * 全查用户
     */
    @GetMapping("")
    public List<User> findAll(){
        return jpaUserService.findAllUser();
    }

    /**
     * id查用户
     */
    @GetMapping("/{id}")
    public User findbyId(@PathVariable("id") Long id){
        return jpaUserService.findUserById(id);
    }
}

