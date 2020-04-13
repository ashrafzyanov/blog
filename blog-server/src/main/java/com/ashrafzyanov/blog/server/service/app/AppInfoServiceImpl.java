package com.ashrafzyanov.blog.server.service.app;

import com.ashrafzyanov.blog.server.dto.AppInfoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Реализация сервиса для получения информации о приложений
 */
@Service
public class AppInfoServiceImpl implements AppInfoService {

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.build}")
    private String appBuild;

    @Value("${app.description}")
    private String description;

    public AppInfoDTO getAppInfo() {
        return new AppInfoDTO(appVersion, appBuild, null, description);
    }
}
