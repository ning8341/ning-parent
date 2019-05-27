package com.ning.service;

import com.ning.model.UserModel;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/5/27 16:36
 * @Version: ning-parentV1.0
 */
public interface UserService {

    UserModel queryOne(Long id);
}
