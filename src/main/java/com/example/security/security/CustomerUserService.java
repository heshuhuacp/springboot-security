package com.example.security.security;

import com.example.security.dao.SysUserRepository;
import com.example.security.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 自定义需要实现UserDetailsService接口
 */
public class CustomerUserService implements UserDetailsService {

    @Autowired
    SysUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userRepository.findAllByUsername(username);
        if(user == null){
            throw  new UsernameNotFoundException("用户不存在");
        }
        return user;
    }
}
