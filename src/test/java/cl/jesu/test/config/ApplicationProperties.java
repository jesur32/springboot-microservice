package cl.jesu.test.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix = "application-test", ignoreUnknownFields = false)
@EnableConfigurationProperties
public class ApplicationProperties {

}
