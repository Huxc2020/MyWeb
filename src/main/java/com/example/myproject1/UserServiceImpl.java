package com.example.myproject1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository jpaUserRepository;

    @Override
    public User insertUser(User user) {
        return jpaUserRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        jpaUserRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return jpaUserRepository.save(user);
    }

    @Override
    public List<User> findAllUser() {
        return jpaUserRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return jpaUserRepository.findById(id).orElse(null);
    }
}

