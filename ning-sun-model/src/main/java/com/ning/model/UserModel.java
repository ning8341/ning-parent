package com.ning.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/5/27 16:23
 * @Version: ning-parentV1.0
 */
@Data
@TableName("s_user")
public class UserModel implements Serializable{

    @TableId(value = "id_",type = IdType.ID_WORKER)
    public Long id;

    @TableField("name_")
    public String name;
}
