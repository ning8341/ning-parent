package com.ning.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ning.model.UserModel;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/5/27 16:33
 * @Version: ning-parentV1.0
 */
public interface UserMapper extends BaseMapper<UserModel>{

    UserModel selectUserById(@Param("id") Long id);
}
