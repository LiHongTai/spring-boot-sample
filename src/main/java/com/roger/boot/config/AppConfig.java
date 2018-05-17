package com.roger.boot.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private String name;
    private Integer pageSize;
    private String description;
    private String version;
    private Boolean showAdvert;
    private String website;
}
