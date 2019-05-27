package com.ning.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ning.dao.UserMapper;
import com.ning.model.UserModel;
import com.ning.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/5/27 16:36
 * @Version: ning-parentV1.0
 */
@Slf4j
@Service(interfaceClass = UserService.class,version = "1.0.0")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserModel> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserModel queryOne(Long id) {
        Wrapper<UserModel> wrapper = new EntityWrapper<>();
        wrapper.eq("status_", "1");//eq相等，具体api请查看mybatisplus的官网
        withTestMapper();
        return super.selectOne(wrapper);
    }

    private void withTestMapper() {
        log.info("此时此刻，测试一下传统的mybatis查询方式");
        Long id = 1130371095053901826L;
        UserModel userModel = userMapper.selectUserById(id);
        log.info("现在查看结果,当前用户信息为" + userModel.getName());//就get 一个name吧，实体类懒得写了。

    }


}
