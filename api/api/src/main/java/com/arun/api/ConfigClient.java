package com.arun.api;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties  ("test")

//the name this application should match to the file name of you git repository that is  apigateway.properties that is present on github
@org.springframework.context.annotation.Configuration
public class ConfigClient {

	@Override
	public String toString() {
		return "Configuration [value=" + value + "]";
	}

	private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
