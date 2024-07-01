package com.vanpine.Service.Impl;

import com.vanpine.Mapper.DemoMapper;
import com.vanpine.Pojo.User;
import com.vanpine.Service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {
    private final DemoMapper demoMapper;

    public User queryVanpineUserInfo(String username) {
        return demoMapper.queryVanpineUserInfo(username);
    }
}
