package com.ashrafzyanov.blog.server.service.app;

import com.ashrafzyanov.blog.server.dto.AppInfoDTO;

/**
 * Сервис для поулчения информации о приложений
 */
public interface AppInfoService {

    AppInfoDTO getAppInfo();
}
