package com.ashrafzyanov.blog.server.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO для информации о приложении
 */
@Value
public class AppInfoDTO implements Serializable {

    private String version;
    private String build;
    private List<String> authors;
    private String description;

}
