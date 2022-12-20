package com.github.rzmvski.Service;



import com.github.rzmvski.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    void delete(Long id);

    void update(Long id, User user);
}
