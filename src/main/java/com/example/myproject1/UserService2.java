package com.example.myproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService2 {

    @Autowired
    UserRepository userRepository;

    void insert(UserDto userDto) {
        userRepository.save(new User(userDto.userId, userDto.name, userDto.telNumber, userDto.location, userDto.isInjected, userDto.isMijie));

    }
    void delete(long userId){
        userRepository.deleteById(userId);
    }
}
