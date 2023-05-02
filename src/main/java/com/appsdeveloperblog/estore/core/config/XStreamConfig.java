package com.appsdeveloperblog.estore.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thoughtworks.xstream.XStream;

@Configuration
public class XStreamConfig {
	@Bean
    XStream xStream() {
		XStream xStream = new XStream();

		xStream.allowTypesByWildcard(new String[] { "com.appsdeveloperblog.**" });
		return xStream;
	}
}
