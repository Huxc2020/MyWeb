package com.example.myproject1;
import java.util.List;
public interface UserService {
    /**
     * 新增用户
     * @param user 用户对象
     */
    User insertUser(User user);

    /**
     * 删除用户
     * @param id 删除id
     */
    void deleteUser(Long id);

    /**
     * 修改用户
     * @param user 用户信息
     */
    User updateUser(User user);

    /**
     * 查询所有用户
     */
    List<User> findAllUser();

    /**
     * 通过id查询用户
     * @param id 用户id
     */
    User findUserById(Long id);
}

