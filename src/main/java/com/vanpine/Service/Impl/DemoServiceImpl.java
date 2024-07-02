package com.vanpine.Service.Impl;

import cn.hutool.json.JSONUtil;
import com.github.xiaoymin.knife4j.core.util.StrUtil;
import com.vanpine.Mapper.DemoMapper;
import com.vanpine.Pojo.User;
import com.vanpine.Service.DemoService;
import io.github.classgraph.json.JSONUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {
    private final DemoMapper demoMapper;
    private final StringRedisTemplate stringRedisTemplate;

    public User queryVanpineUserInfo(String username) {
        String user = stringRedisTemplate.opsForValue().get("username");
        // 命中缓存
        if (!StrUtil.isBlank(user)) {
            return JSONUtil.toBean(user, User.class);
        }
        // 未命中缓存
        User userToMapper = demoMapper.queryVanpineUserInfo(username);
        // 设置到缓存当中去
        stringRedisTemplate.opsForValue().set("username", JSONUtil.toJsonStr(userToMapper), 60, TimeUnit.SECONDS);
        return userToMapper;
    }
}
