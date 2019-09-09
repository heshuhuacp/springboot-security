package com.example.security.dao;

import com.example.security.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    SysUser findAllByUsername(String username);
}
