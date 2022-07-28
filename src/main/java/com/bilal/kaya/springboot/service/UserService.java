package com.bilal.kaya.springboot.service;

import com.bilal.kaya.springboot.dto.UserDto;
import com.bilal.kaya.springboot.entity.User;
import com.bilal.kaya.springboot.util.CustomPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    List<UserDto> getUsers();
    UserDto getUser(Long id);
    UserDto updateUser(Long id,UserDto user);
    Page<User> pagination(int currentPage,int PageSize);
    Page<User> pagination(Pageable pageable);
    Slice<User> slice(Pageable pageable);
    CustomPage<UserDto> customPagination(Pageable pageable);
}
