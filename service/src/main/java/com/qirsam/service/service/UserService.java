package com.qirsam.service.service;

import com.qirsam.database.dao.UserDao;
import com.qirsam.database.entity.User;
import com.qirsam.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}
