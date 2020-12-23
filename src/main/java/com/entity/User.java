package com.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    private String userId;
    @TableField("USER_NAME")
    private String userName;
    @TableField("PASSWORD")
    private String password;

}
