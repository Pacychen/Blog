package com.chan.blog.service;

import com.chan.blog.dao.pojo.SysUser;
import com.chan.blog.vo.Result;
import com.chan.blog.vo.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface SysUserService {

    UserVo findUserVoById(Long id);

    SysUser findUserById(Long id);

    SysUser findUser(String account, String pwd);


    Result getUserInfoByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);
}
