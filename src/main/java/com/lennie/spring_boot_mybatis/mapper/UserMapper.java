package com.lennie.spring_boot_mybatis.mapper;

import com.lennie.spring_boot_mybatis.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUser(Integer id);
}
