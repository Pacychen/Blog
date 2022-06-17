package com.chan.blog.service;

import com.chan.blog.dao.pojo.SysUser;
import com.chan.blog.vo.Result;
import com.chan.blog.vo.params.LoginParams;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LoginService {

    /**
     * 登录
     * @param loginParam
     * @return
     */
    Result login(LoginParams loginParam);

    SysUser checkToken(String token);

    Result logout(String token);

    Result register(LoginParams loginParams);
}
