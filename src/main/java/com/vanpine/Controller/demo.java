package com.vanpine.Controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSort;
import com.vanpine.Entity.Result;
import com.vanpine.Pojo.User;
import com.vanpine.Service.DemoService;
import com.vanpine.Service.Impl.DemoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
@Api(tags = "测试相关接口")
public class demo {

    private final DemoServiceImpl demoService;

    @GetMapping
    @ApiOperation(value = "根据用户名查询用户")
    public Result<User> demoTest(@RequestParam String username) {
        return Result.success(demoService.queryVanpineUserInfo(username));
    }
}
