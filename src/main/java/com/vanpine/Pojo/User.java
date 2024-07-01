package com.vanpine.Pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String gender;
    private Integer age;
}
