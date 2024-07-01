package com.vanpine.Controller;

import com.vanpine.Entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demo {
    @GetMapping
    public Result<String> demoTest() {
        return Result.success("Welcome to ");
    }
}
