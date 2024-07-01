package com.vanpine.Service;

import com.vanpine.Pojo.User;
import org.springframework.stereotype.Service;

public interface DemoService {

    User queryVanpineUserInfo(String username);
}
