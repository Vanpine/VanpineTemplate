package com.vanpine.Controller;

import com.vanpine.Entity.Result;
import com.vanpine.Pojo.User;
import com.vanpine.Service.DemoService;
import com.vanpine.Service.Impl.DemoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class demo {

    private final DemoServiceImpl demoService;

    @GetMapping
    public Result<User> demoTest(@RequestParam String username) {
        return Result.success(demoService.queryVanpineUserInfo(username));
    }
}
