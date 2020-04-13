package com.ashrafzyanov.blog.server.controller.app;

import com.ashrafzyanov.blog.server.dto.AppInfoDTO;
import com.ashrafzyanov.blog.server.service.app.AppInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/app")
@RequiredArgsConstructor
public class AppInfoController {

    private final AppInfoService appInfoService;

    @GetMapping("/info")
    AppInfoDTO appInfo() {
        return appInfoService.getAppInfo();
    }


    @GetMapping("/test")
    String test() {
        return "hello";
    }
}
