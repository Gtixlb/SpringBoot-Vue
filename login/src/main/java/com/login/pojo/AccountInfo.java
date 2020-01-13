package com.login.pojo;

import lombok.Data;

/**
 * @program:SpringBoot-Vue
 * @description:账户信息
 * @author:Mr.Chen
 * @create:2020-01-07 22:06
 **/
@Data
public class AccountInfo {
    private int id;

    private String userName;

    private String passWord;

    private String gender;

    private int age;


}
