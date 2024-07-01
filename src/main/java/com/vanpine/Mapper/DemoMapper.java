package com.vanpine.Mapper;

import com.vanpine.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface DemoMapper {

    User queryVanpineUserInfo(String username);
}
